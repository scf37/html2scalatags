package me.scf37.h2s.htmlCleaner

import me.scf37.h2s.dom.TagNode
import me.scf37.h2s.dom.TextNode
import org.scalatest.FreeSpec

class ParserTest extends FreeSpec{
  val p = new Parser
  "html cleaner parser" - {
    "returns html node for html tag" in {
      val html = "<html><body>boo</body></html>"
      val tags = p.parse(html)
      assert(tags.length == 1)
      assert (tags.head.asInstanceOf[TagNode].name == "html")
    }

    "returns html node for html tag with doctype" in {
      val html = "<!DOCTYPE html><html><body>boo</body></html>"
      val tags = p.parse(html)
      assert(tags.length == 1)
      assert (tags.head.asInstanceOf[TagNode].name == "html")
    }

    "returns head node for head tag" in {
      val html = "<head></head><body>boo</body>"
      val tags = p.parse(html)
      assert(tags.length == 2)
      assert(tags.head.asInstanceOf[TagNode].name == "head")
      assert(tags(1).asInstanceOf[TagNode].name == "body")
    }

    "returns body node for body tag" in {
      val html = "<body>boo</body>"
      val tags = p.parse(html)
      assert(tags.length == 1)
      assert(tags.head.asInstanceOf[TagNode].name == "body")
    }
    "returns inner html for html snippet" in {
      val html = "<hello>world</hello>"
      val tags = p.parse(html)
      assert(tags.length == 1)
      assert(tags.head.asInstanceOf[TagNode].name == "hello")
    }

    "returns inner html for html snippet (2)" in {
      val html = "<hello>world</hello><foo>goo</foo>"
      val tags = p.parse(html)
      assert(tags.length == 2)
      assert(tags.head.asInstanceOf[TagNode].name == "hello")
      assert(tags(1).asInstanceOf[TagNode].name == "foo")
    }

    "returns inner html for html snippet (3)" in {
      val html = "hello<world>"
      val tags = p.parse(html)
      assert(tags.length == 2)
      assert(tags.head.asInstanceOf[TextNode].text == "hello")
      assert(tags(1).asInstanceOf[TagNode].name == "world")
    }

    "does not trim attribute values" in {
      val html = """<div class=" a " """
      val tags = p.parse(html)
      assert(tags.head.asInstanceOf[TagNode].attributes.head._2 == " a ")
    }

  }
}
