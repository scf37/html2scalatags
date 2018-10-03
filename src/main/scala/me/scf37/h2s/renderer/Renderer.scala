package me.scf37.h2s.renderer

case class Ctx(bits: Vector[String])

class TextScalaRenderer(hl: Highlighter = new TextHighlighter, identLength: Int = 2) {

  def render(nodes: Seq[ScalatagsNode]): String = {
    val sb = new StringBuilder

    if (nodes.length == 1) {
      sb ++= doRender(nodes.head, 0)
    } else {
      sb ++= hl.function("Seq") + hl.punctuation("(")
      sb ++= renderSequence(nodes, 0, false)
    }
    sb.toString()
  }

  def makeIdent(ident: Int): String = new String(Array.fill(ident * identLength)(' '))

  private def doRender(node: ScalatagsNode, ident: Int): String = node match {
    case ScalatagsComment(comment) =>
      val s = if (comment.contains("\n"))
        hl.comment("/*" + comment.replace("*/", "*\\u002F") + "*/")
      else
        hl.comment("//" + escapeScalaString(comment))

      s

    case ScalatagsTag(name, attributes, data, supported) =>
      val sb = new StringBuilder

      sb ++= renderTagName(name, supported)
      sb ++= hl.punctuation("(")

      sb ++= attributes.map(renderAttribute).mkString(hl.punctuation(",") + " ")

      sb ++= renderSequence(data, ident, attributes.nonEmpty)

      sb.toString()

    case ScalatagsString(name) =>
      if (name.contains("\n"))
        hl.text("\"\"\"" + escapeScalaString(name) + "\"\"\"")
      else
        hl.text("\"" + escapeScalaString(name) + "\"")
  }

  private def renderSequence(data: Seq[ScalatagsNode], ident: Int, needComma0: Boolean): String = {
    val sb = new StringBuilder

    var needComma = needComma0
    var needEol = false

    def appendOnSameLine(s: String, ident: Int): Unit = {
      if (needEol) {
        needEol = false
        appendOnNewLine(s, comma = true, ident, mustEol = false)
        return
      }
      if (needComma) {
        sb ++= hl.punctuation(",") + " "
      }
      sb ++= s
      needComma = true
    }
    def appendOnNewLine(s: String, comma: Boolean, ident: Int, mustEol: Boolean): Unit = {
      if (needComma) {
        sb ++= hl.punctuation(",") + " "
      }
      sb ++= "\n"
      sb ++= makeIdent(ident)
      sb ++= s
      needComma = comma
      needEol = mustEol
    }

    var hasNestedTags = false
    for (i <- data.indices) {
      val node = data(i)

      node match {
        case n: ScalatagsComment =>
          appendOnNewLine(doRender(n, ident + 1), comma = false, ident = ident + 1, mustEol = true)

        case n: ScalatagsString if n.s.length < 20 =>
          appendOnSameLine(doRender(n, ident + 1), ident + 1)

        case n =>
          appendOnNewLine(doRender(n, ident + 1), comma = true, ident = ident + 1, mustEol = false)
          hasNestedTags = true
      }
    }

    needComma = false
    if (hasNestedTags)
      appendOnNewLine(hl.punctuation(")"), comma = true, ident = ident, mustEol = false)
    else
      appendOnSameLine(hl.punctuation(")"), ident)

    sb.toString()
  }

  private def renderAttribute(attr: ScalatagsAttribute): String = {
    val name = if (attr.dataAttribute) {
      hl.function("data") + hl.punctuation("(") +
        hl.value("\"" + attr.name + "\"") + hl.punctuation(")")
    } else if (attr.supported) {
      hl.attr(attr.name)
    } else {
      hl.function("attr") + hl.punctuation("(") +
      hl.value("\"" + escapeScalaString(attr.name) + "\"") + hl.punctuation(")")
    }
    attr.value match {
      case None => name
      case Some(v) => name + hl.punctuation(" := ") + hl.value("\"" + escapeScalaString(v) + "\"")
    }
  }

  private def renderTagName(name: String, supported: Boolean): String = {
    if (supported) {
      hl.tag(name)
    } else {
      hl.function("tag") + hl.punctuation("(") +
      hl.value("\"" + escapeScalaString(name) + "\"") + hl.punctuation(")")
    }
  }

  private def escapeScalaString(s: String): String =
      s.replace("\\", "\\\\").replace("\"", "\\\"")
}
