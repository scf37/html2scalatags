## HTML to Scalatags converter
Online version: https://scf37.me/tools/html-to-scalatags-converter

Converts any, even invalid, HTML to format accepted by Li Haoyi's Scalatags library.

Features:

- Accepts even invalid HTML
- Properly handles HTML and Scala escaping, including unicode and multiline strings
- Properly handles &lt;pre&gt; tags and spaces for inline flow
- Keeps comments
- Smart pretty print

As an example, it can convert this:

```html
<h1>Dude &amp; Dude</h1>
<!-- the form -->
<form>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <pre>
      first line
      second line
  </pre>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
```

to that:
```scala
Seq(
  h1("Dude & Dude"), 
  // the form 
  form(
    div(cls := "form-group", 
      label(`for` := "exampleInputEmail1", "Email address"), 
      input(tpe := "email", cls := "form-control", aria.describedby := "emailHelp", placeholder := "Enter email"), 
      small(id := "emailHelp", cls := "form-text text-muted", 
        "We'll never share your email with anyone else."
      )
    ), 
    pre(
      """
      first line
      second line
  """
    ), 
    button(tpe := "submit", cls := "btn btn-primary", "Submit")
  )
)
```

License: LGPLv3
