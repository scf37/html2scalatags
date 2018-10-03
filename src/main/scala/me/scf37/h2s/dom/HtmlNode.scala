package me.scf37.h2s.dom

/**
  * Represents HTML DOM tree
  */
sealed trait HtmlNode

/**
  * Html tag
  */
trait TagNode extends HtmlNode {
  def name: String
  def children: Seq[HtmlNode]
  def attributes: Seq[(String, String)]
}

// contents of style and script tags should not be escaped
/**
  * Html inline text
  */
trait TextNode extends HtmlNode {
  def text: String
}

/**
  * Html/Xml comment
  */
trait CommentNode extends HtmlNode {

  /**
    * @return text of HTML comment, w/o <!-- and -->
    */
  def commentText: String
}
