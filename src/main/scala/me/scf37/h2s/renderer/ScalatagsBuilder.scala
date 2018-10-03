package me.scf37.h2s.renderer

import me.scf37.h2s.dom.CommentNode
import me.scf37.h2s.dom.HtmlNode
import me.scf37.h2s.dom.TagNode
import me.scf37.h2s.dom.TextNode


sealed trait ScalatagsNode

case class ScalatagsString(s: String) extends ScalatagsNode
case class ScalatagsComment(comment: String) extends ScalatagsNode
case class ScalatagsAttribute(
  name: String,
  value: Option[String],
  supported: Boolean,
  dataAttribute: Boolean
)

case class ScalatagsTag(
  name: String,
  attributes: Seq[ScalatagsAttribute],
  nodes: Seq[ScalatagsNode],
  supported: Boolean,
) extends ScalatagsNode

/**
  * Builds Scalatags representation from parsed HTML tree
  *
  * @param preserveWhitespace preserve minimal whitespace in HTML text - important for inline tags
  */
class ScalatagsBuilder(preserveWhitespace: Boolean = true) {

  def build(nodes: Seq[HtmlNode]): Seq[ScalatagsNode] = {
    buildNodes(nodes, RenderContext())
  }

  private def buildNodes(nodes: Seq[HtmlNode], ctx: RenderContext): Seq[ScalatagsNode] = {
    val it = nodes.iterator

    // takes text and comment nodes from the iterator
    // and trims excess whitespace
    def takeText(): (Seq[ScalatagsNode], Option[TagNode]) = {
      var hadWhitespace = false
      var hadText = false
      val result = Seq.newBuilder[ScalatagsNode]

      def makeResult(tagNode: Option[TagNode]): (Seq[ScalatagsNode], Option[TagNode]) = {
        if (hadWhitespace && !hadText && preserveWhitespace)
          (result.result() :+ ScalatagsString(" ")) -> tagNode
        else
          result.result() -> tagNode
      }

      while (it.hasNext) {
        it.next() match {
          case n: TagNode => return makeResult(Some(n))

          case n: TextNode =>
            if (ctx.preLevel > 0) {
              result += ScalatagsString(unescapeHtmlTextIfNeeded(n.text, ctx))
            } else {
              if (n.text.nonEmpty) {
                hadWhitespace = true
              }
              if (n.text.trim.nonEmpty) {
                hadText = true
                val s = if (preserveWhitespace) trimForHtml(n.text) else n.text.trim

                result += ScalatagsString(unescapeHtmlTextIfNeeded(s, ctx))
              }
            }

          case n: CommentNode => result += ScalatagsComment(n.commentText)
        }
      }

      makeResult(None)
    }
    val result = Seq.newBuilder[ScalatagsNode]

    while (true) {
      val (text, node) = takeText()
      result ++= text

     node match {
       case Some(node) =>
         if (node.name.toLowerCase == "pre") {
           result += buildNode(node, ctx.copy(preLevel = ctx.preLevel + 1))
         } else {
           result += buildNode(node, ctx)
         }

       case None =>
         return result.result()
     }
    }

    ???
  }

  private def unescapeHtmlTextIfNeeded(s: String, ctx: RenderContext): String = {
    if (ctx.parentNode != "script" && ctx.parentNode != "style")
      unescapeHtml(s)
    else s
  }

  // this one is totally incomplete but works for usual cases
  private def unescapeHtml(s: String): String =
    s.replace("&amp;", "&")
      .replace("&lt;", "<")
      .replace("&gt;", ">")
      .replace("&quot;", "\"")
      .replace("&#x27;", "'")
      .replace("&#x2F", "/")


  private def trimForHtml(s: String): String = {
    val leadingWs = Character.isWhitespace(s.head)
    val tailingWs = Character.isWhitespace(s.last)
    var ss = s.trim
    if (leadingWs) ss = " " + ss
    if (tailingWs) ss = ss + " "
    ss
  }

  private def buildNode(node: TagNode, ctx: RenderContext): ScalatagsNode = {

    val attributes: Seq[ScalatagsAttribute] = node.attributes.map { case (name, value) =>
      if (name.toLowerCase.startsWith("data-"))
        ScalatagsAttribute(
          name = name.dropRight("data-".length),
          value = Some(value),
          supported = false,
          dataAttribute = true
        )
      else ScalatagsBuilder.knownAttributes.get(name.toLowerCase) match {

        case Some(v) if v.endsWith("!") && value.toLowerCase == name.toLowerCase =>
          // disabled="disabled" in html, we can omit value
          ScalatagsAttribute(
            name = v.dropRight(1),
            value = None,
            supported = true,
            dataAttribute = false
          )

        case Some(v) =>
          ScalatagsAttribute(
            name = v,
            value = Some(value),
            supported = true,
            dataAttribute = false
          )

        case None =>
          ScalatagsAttribute(
            name = name,
            value = Some(value),
            supported = false,
            dataAttribute = false
          )
      }
    }

    val ctx2 = ctx.copy(
      preLevel = if (node.name == "tr") ctx.preLevel + 1 else ctx.preLevel,
      parentNode = node.name.toLowerCase())

    val nestedNodes = buildNodes(node.children, ctx2)

    ScalatagsTag(
      name = node.name,
      attributes = attributes,
      nodes = nestedNodes,
      supported = ScalatagsBuilder.knownTags.contains(node.name)
    )
  }

}

object ScalatagsBuilder {
  private val knownTags: Map[String, String] = Seq(
    "html", "head", "base", "link", "meta", "script", "body", "h1", "h2", "h3", "h4", "h5", "h6",
    "header", "footer", "p", "hr", "pre", "blockquote", "ol", "ul", "li", "dl", "dt", "dd", "figure",
    "figcaption", "div", "a", "em", "strong", "small", "s", "cite", "code", "sub", "sup", "i", "b", "u",
    "span", "br", "wbr", "ins", "del", "img", "iframe", "embed", "object","param", "video", "audio",
    "source", "track", "canvas", "map", "area", "table", "caption", "colgroup", "col", "tbody", "thead",
    "tfoot", "tr", "td", "th", "form", "fieldset", "legend", "label", "input", "button", "select", "datalist",
    "optgroup", "option", "textarea").map {
    case "object" => "object" -> "`object`"
    case v => v -> v
  }.toMap

  // "data-xxx" -> data("xxx")
  // value ends with ! -> value is optional
  private val knownAttributes: Map[String, String] = {
    val attrs = Seq(
      "accesskey", "contenteditable", "contextmenu", "dir", "draggable!", "dropzone", "hidden!", "id",
      "lang", "spellcheck!", "style", "tabindex", "title", "translate!", "onerror", "oncopy", "oncut", "onpaste",
      "onabort", "oncanplay", "oncanplaythrough", "oncuechange", "ondurationchange", "onemptied", "onended",
      "onloadeddata", "onloadedmetadata", "onloadstart", "onpause", "onplay", "onplaying", "onprogress",
      "onratechange", "onseeked", "onseeking", "onstalled", "onsuspend", "ontimeupdate", "onvolumechange",
      "onwaiting", "onshow", "ontoggle", "onload", "onafterprint", "onbeforeprint", "onbeforeunload",
      "onhashchange", "onmessage", "onoffline", "ononline", "onpagehide", "onpageshow", "onpopstate",
      "onresize", "onstorage", "onunload", "onblur", "onchange", "onfocus", "onselect", "onsubmit", "onreset",
      "oncontextmenu", "oninput", "oninvalid", "onsearch", "selected!", "onkeydown", "onkeyup", "onkeypress",
      "onclick", "ondblclick", "ondrag", "ondragend", "ondragenter", "ondragleave", "ondragover", "ondragstart",
      "ondrop", "onmousedown", "onmousemove", "onmouseout", "onmouseover", "onmouseup", "onscroll", "onwheel",
      "action", "autocomplete", "autofocus!", "checked!", "enctype", "formaction", "formenctype",
      "formmethod", "formnovalidate", "formtarget", "list", "max", "min", "multiple!", "maxlength", "method",
      "name", "pattern", "placeholder", "readonly!", "required!","size", "step", "target", "type","value",
      "href", "alt", "rel", "src", "xmlns", "accept", "charset", "disabled!", "rows", "cols", "role",
      "content", "http-equiv", "media", "colspan", "rowspan", "wrap"
    )

    val ariaAttributes = Map(
      "aria-activedescendant" -> "aria.activedescendant", "aria-atomic" -> "aria.atomic",
      "aria-autocomplete" -> "aria.autocomplete", "aria-busy" -> "aria.busy",
      "aria-checked" -> "aria.checked", "aria-controls" -> "aria.controls",
      "aria-describedby" -> "aria.describedby", "aria-disabled" -> "aria.disabled",
      "aria-dropeffect" -> "aria.dropeffect", "aria-expanded" -> "aria.expanded",
      "aria-flowto" -> "aria.flowto", "aria-grabbed" -> "aria.grabbed", "aria-haspopup" -> "aria.haspopup",
      "aria-hidden" -> "aria.hidden", "aria-invalid" -> "aria.invalid", "aria-label" -> "aria.label",
      "aria-labelledby" -> "aria.labelledby", "aria-level" -> "aria.level", "aria-live" -> "aria.live",
      "aria-multiline" -> "aria.multiline", "aria-multiselectable" -> "aria.multiselectable",
      "aria-orientation" -> "aria.orientation", "aria-owns" -> "aria.owns", "aria-posinset" -> "aria.posinset",
      "aria-pressed" -> "aria.pressed", "aria-readonly" -> "aria.readonly", "aria-relevant" -> "aria.relevant",
      "aria-required" -> "aria.required", "aria-selected" -> "aria.selected", "aria-setsize" -> "aria.setsize",
      "aria-sort" -> "aria.sort", "aria-valuemax" -> "aria.valuemax", "aria-valuemin" -> "aria.valuemin",
      "aria-valuenow" -> "aria.valuenow", "aria-valuetext" -> "aria.valuetext")

    attrs.map {
      case v if v.endsWith("!") => v.dropRight(1) -> v
      case v => v -> v
    }.toMap ++ ariaAttributes ++ Map("class" -> "cls", "type" -> "tpe", "for" -> "`for`")
  }
}

private case class RenderContext(
  parentNode: String = "",
  preLevel: Int = 0
)