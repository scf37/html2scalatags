package me.scf37.h2s.renderer

import me.scf37.h2s.util.Util

case class Ctx(bits: Vector[String])

class Renderer(hl: Highlighter = new TextHighlighter, identLength: Int = 2) {
  private val leftParen = hl.punctuation("(")
  private val rightParen = hl.punctuation(")")
  private val comma = hl.punctuation(",")
  private val idents: Array[String] = (0 to 10)
    .map(len => new String(Array.fill(len * identLength)(' '))).toArray

  def render(nodes: Seq[ScalatagsNode]): String = {
    val sb = new StringBuilder(1024)

    if (nodes.length == 1) {
      sb ++= doRender(nodes.head, 0)
    } else {
      sb ++= hl.function("Seq") + leftParen
      renderSequence(nodes, 0, false, sb)
    }
    sb.toString()
  }

  def makeIdent(ident: Int): String = {
    if (ident < idents.length)
      idents(ident)
    else
      new String(Array.fill(ident * identLength)(' '))
  }

  private def doRender(node: ScalatagsNode, ident: Int): String = node match {
    case ScalatagsComment(comment) =>
      val s = if (comment.contains("\n"))
        hl.comment("/*" + Util.replace(comment, "*/", "*\\u002F") + "*/")
      else
        hl.comment("//" + escapeScalaString(comment))

      s

    case ScalatagsTag(name, attributes, data, supported) =>
      val sb = new StringBuilder(256)

      sb ++= renderTagName(name, supported)
      sb ++= leftParen

      sb ++= attributes.map(renderAttribute).mkString(comma + " ")

      renderSequence(data, ident, attributes.nonEmpty, sb)

      sb.toString()

    case ScalatagsString(name) =>
      if (name.contains("\n"))
        hl.text("\"\"\"" + escapeScalaString(name) + "\"\"\"")
      else
        hl.text("\"" + escapeScalaString(name) + "\"")
  }

  private def renderSequence(data: Seq[ScalatagsNode], ident: Int, needComma0: Boolean, sb: StringBuilder): Unit = {

    var needComma = needComma0
    var needEol = false

    def appendOnSameLine(s: String, ident: Int): Unit = {
      if (needEol) {
        needEol = false
        appendOnNewLine(s, comma = true, ident, mustEol = false)
        return
      }
      if (needComma) {
        sb ++= comma
        sb += ' '
      }
      sb ++= s
      needComma = true
    }
    def appendOnNewLine(s: String, comma: Boolean, ident: Int, mustEol: Boolean): Unit = {
      if (needComma) {
        sb ++= this.comma
        sb += ' '
      }
      sb += '\n'
      sb ++= makeIdent(ident)
      sb ++= s
      needComma = comma
      needEol = mustEol
    }

    var hasNestedTags = false
    var i = 0
    while (i < data.length) {
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
      i += 1
    }

    needComma = false
    if (hasNestedTags)
      appendOnNewLine(rightParen, comma = true, ident = ident, mustEol = false)
    else
      appendOnSameLine(rightParen, ident)

    sb.toString()
  }

  private def renderAttribute(attr: ScalatagsAttribute): String = {
    val name = if (attr.dataAttribute) {
      hl.function("data") + leftParen +
        hl.value("\"" + attr.name + "\"") + rightParen
    } else if (attr.supported) {
      hl.attr(attr.name)
    } else {
      hl.function("attr") + leftParen +
      hl.value("\"" + escapeScalaString(attr.name) + "\"") + rightParen
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
      hl.function("tag") + leftParen +
      hl.value("\"" + escapeScalaString(name) + "\"") + rightParen
    }
  }

  private def escapeScalaString(s: String): String = {
    val ss = Util.replace(s, "\\", "\\\\")
    Util.replace(ss, "\"", "\\\"")
  }
}
