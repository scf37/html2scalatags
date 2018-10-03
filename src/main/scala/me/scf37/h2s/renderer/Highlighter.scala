package me.scf37.h2s.renderer

trait Highlighter {
  def tag(s: String): String
  def attr(s: String): String
  def function(s: String): String
  def value(s: String): String
  def text(s: String): String
  def comment(s: String): String
  def punctuation(s: String): String
}

class TextHighlighter extends Highlighter {
  override def tag(s: String): String = s

  override def attr(s: String): String = s

  override def function(s: String): String = s

  override def value(s: String): String = s

  override def text(s: String): String = s

  override def comment(s: String): String = s

  override def punctuation(s: String): String = s
}


class HtmlHighlighter(
  tagStyle: String,
  attrStyle: String,
  functionStyle: String,
  valueStyle: String,
  textStyle: String,
  commentStyle: String,
  punctuationStyle: String
) extends Highlighter {
  override def tag(s: String): String = span(tagStyle, s)

  override def attr(s: String): String = span(attrStyle, s)

  override def function(s: String): String = span(functionStyle, s)

  override def value(s: String): String = span(valueStyle, s)

  override def text(s: String): String = span(textStyle, s)

  override def comment(s: String): String = span(commentStyle, s)

  override def punctuation(s: String): String = span(punctuationStyle, s)

  private def span(style: String, value: String): String =
    s"<span $style>${escapeHtml(value)}</span>"

  private def escapeHtml(s: String): String = {
    val out = new StringBuilder(s.length * 3 / 2)
    s.foreach {
      case '&' => out ++= "&amp;"
      case '<' => out ++= "&lt;"
      case '>' => out ++= "&gt;"
      case '"' => out ++= "&quot;"
      case '\'' => out ++= "&#x27;"
      case '/' => out ++= "&#x2F;"
      case c => out += c
    }
    out.toString()

  }
}
