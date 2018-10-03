body(
  // empty div 
  " ", 
  div(), 
  // unknown tag and attribute 
  " ", 
  tag("hello")(attr("world") := "forever"), 
  // div with no nested elements - must be single-line 
  " ", 
  div(cls := "clazz", data("data") := "dataattr", aria.label := "arialabel", disabled), 
  // case insensitivity 
  " ", 
  tag("hello")(attr("world") := "Forever", " "), " ", 
  div(cls := "clazz", data("data") := "DataAttr", aria.label := "AriaLabel", disabled), 
  // short text in div 
  " ", 
  div("12"), 
  // long text in div 
  " ", 
  div(
    "here is very very very very long line of text"
  ), 
  // multiline text in div 
  " ", 
  div(
    """ line one
        line two
        line three """
  ), 
  /* multiline
    comment */
  " ", 
  div("just div"), 
  // some nested tags 
  " ", 
  tag("article")(" ", 
    div(" ", 
      p(" text1 ", 
        span("text2 "), " "
      ), " "
    ), " "
  ), 
  // pre tag 
  " ", 
  pre(
    """
                pre
                pre
                """, 
    span(
      """
                  pre pre
                  pre
                  """, 
      pre(
        """
                    more
                    pre
                  """
      ), 
      """
                   pre
                   again
                """
    ), 
    """
                last
                pre
              """
  ), 
  // multiple text and comment nodes 
  " text a ", 
  // comment a1 
  // comment a2 
  " text b ", 
  // comment b1 
  // comment b2 
  " text c ", 
  br(), 
  // comment inside 
  " ", 
  span(
    // comment 
  ), 
  // tags w/o spaces 
  " ", 
  span("a"), 
  span("b"), 
  span("c"), 
  // spaces in tags 
  " ", 
  span(" a "), 
  span("b "), 
  span(" c"), 
  // html escapes 
  " ", 
  a(href := "/hello&world=forever", "<john & fedor>"), 
  // html should not be unescaped for script and style tags 
  " ", 
  script("alert(\"&lt;>\") "), " ", 
  tag("style")(
    "a::after { content: \"&lt;>\";} "
  ), " "
)