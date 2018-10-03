package me.scf37.h2s.htmlCleaner

import java.util.regex.Pattern

import me.scf37.h2s.dom.CommentNode
import me.scf37.h2s.dom.HtmlNode
import me.scf37.h2s.dom.TagNode
import me.scf37.h2s.dom.TextNode
import org.htmlcleaner.BaseToken
import org.htmlcleaner.CleanerProperties
import org.htmlcleaner.ContentNode
import org.htmlcleaner.HtmlCleaner
import org.htmlcleaner.{CommentNode => HCCommentNode}
import org.htmlcleaner.{TagNode => HCTagNode}

import scala.collection.JavaConverters._

/**
  * Parses HTML to HtmlNode tree using HtmlCleaner library
  */
class Parser {
  private val props = new CleanerProperties()
  private val cc = new HtmlCleaner(props)
  private val tagRegex = Pattern.compile("<([\\w\\s]+)[> $]")

  def parse(html: String): Seq[HtmlNode] = {
    val node = cc.clean(html)

    val firstTag = findFirstTag(html).toLowerCase().trim
    val locatedNodes = locateFirstNode(node, firstTag)

    locatedNodes.flatMap(Parser.createHtmlNode)
  }

  private def locateFirstNode(node: HCTagNode, firstTag: String): Seq[BaseToken] = {
    // HtmlCleaner ALWAYS wraps html to <html><head>..<body>.. tags
    // so we need to remove them if they were not present in input

    if (firstTag == "head") {
      return node.getChildTagList.asScala
        .filter(tag => tag.getName == "head" || tag.getName == "body")

    }

    if (firstTag == "body") {
      return node.getChildTagList.asScala
        .filter(tag => tag.getName == "body")
    }

    if (firstTag == "html") {
      return if (node.getName == null) node.getChildTags.toSeq else Seq(node)
    }

    node.getChildTagList.asScala.find(tag => tag.getName == "body")
      .getOrElse(throw new RuntimeException("HtmlCleaner returned HTML w/o body tag?"))
      .getAllChildren.asScala
  }

  private def findFirstTag(html: String): String = {
    val matcher = tagRegex.matcher(html)
    matcher.find() match {
      case false => ""
      case true => matcher.group(1).toLowerCase().trim
    }
  }
}

object Parser {
  def createHtmlNode(node: BaseToken): Option[HtmlNode] = node match {
    case n: HCTagNode => Some(new CleanerHtmlNode(n))
    case n: ContentNode => Some(new CleanerTextNode(n))
    case n: HCCommentNode => Some(new CleanerCommentNode(n))
    case _ => None
  }
}

private class CleanerHtmlNode(node: HCTagNode) extends TagNode {

  override def name: String = node.getName

  override def children: Seq[HtmlNode] = node.getAllChildren.asScala.flatMap(Parser.createHtmlNode)

  override def attributes: Seq[(String, String)] = node.getAttributes
    .entrySet().stream().map[(String, String)](kv => kv.getKey -> kv.getValue).toArray(Array.ofDim[(String, String)](_)).toSeq
}

private class CleanerTextNode(node: ContentNode) extends TextNode {
  override def text: String = node.getContent
}

private class CleanerCommentNode(node: HCCommentNode) extends CommentNode {

  override def commentText: String = node.getContent
}
