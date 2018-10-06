package me.scf37.h2s.renderer

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.stream.Collectors

import me.scf37.h2s.htmlCleaner.Parser
import org.scalatest.FreeSpec

class RendererTest extends FreeSpec {

  "perf test " ignore {
    val p = new Parser
    val r = new ScalatagsBuilder()
    val rr = new Renderer()

    val html = read("big.html")
    val htmlTree = p.parse(html)

    var n = 0
    while (true) {
      val t = System.nanoTime()
      n += rr.render(r.build(htmlTree)).length
      if (t % 500 == 0) {
        System.out.println((System.nanoTime() - t) / 1e6)
      }
    }
    println(n)
  }
  "test reference" in {
    val p = new Parser
    val r = new ScalatagsBuilder()
    val rr = new Renderer()

    val html = read("reference.html")
    val expectedOut = read("reference.scala")

    val out = rr.render(r.build(p.parse(html)))

    assertText(out, expectedOut)
  }

  "test big html" in {
    val p = new Parser
    val r = new ScalatagsBuilder()
    val rr = new Renderer()

    val html = read("big.html")
    val expectedOut = read("big.scala")

    val out = rr.render(r.build(p.parse(html)))

    assertText(out, expectedOut)
  }

  "test multiroot html" in {
    val p = new Parser
    val r = new ScalatagsBuilder()
    val rr = new Renderer()

    val html =
      """
        <!--  top comment -->
        <span>span text</span>
        <!--  middle comment -->
        <div>div text </div><!--  bottom comment -->
      """
    val expectedOut = read("multiroot.scala")

    val out = rr.render(r.build(p.parse(html)))

    assertText(out, expectedOut)
  }

  "test html highlighter" in {
    val p = new Parser
    val r = new ScalatagsBuilder(preserveWhitespace = false)
    val hl = new HtmlHighlighter(
      tagStyle = "class=t",
      attrStyle = "class=a",
      functionStyle = "class=f",
      valueStyle = "class=v",
      textStyle = "class=tx",
      commentStyle = "class=c",
      punctuationStyle = "class=p"
    )
    val rr = new Renderer(hl)

    val html = read("big.html")
    val expectedOut = read("bightml.html")

    val out = rr.render(r.build(p.parse(html)))

    val outHtml =
      s"""<!DOCTYPE html>
         <html>
          <head>
            <style>
                .t{color: purple}
                .a{color: brown}
                .f{color: #2E8DA4}
                .v{color: blue}
                .tt{color: black}
                .c{color: gray}
                .p{color: black}
            </style>
          </head>
          <body>
          <div> here you go:</div>
          <pre>$out</pre>
          </body>
         </html>
       """


    assertText(outHtml, expectedOut)

  }

  private def assertText(out: String, expectedOut: String): Unit = {
    out.split("\n").zip(expectedOut.split("\n")).zipWithIndex.foreach { case ((result, expected), line) =>
      assert(result == expected, "did not match at line " + line)
    }
  }

  private def read(resource: String): String = {
    val is = getClass.getClassLoader.getResourceAsStream(resource)
    val s = new BufferedReader(new InputStreamReader(is))
      .lines().collect(Collectors.joining("\n"))
    is.close()
    s
  }


}
