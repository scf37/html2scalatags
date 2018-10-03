package me.scf37.h2s.util
import java.lang.StringBuilder

object Util {

  // this one is totally incomplete but works for usual cases
  // optimized for performace
  def unescapeHtml(s: String): String = {
    var i = s.indexOf("&")
    if (i < 0) return s
    val out = new StringBuilder(s.length)
    out.append(s, 0, i)
    var replaced = false

    def tryReplace(ss: String, w: Char): Unit = {
      if (s.length - i < ss.length) return
      var j = 0
      while (j < ss.length) {
        if (s.charAt(i + j) != ss.charAt(j)) return
        j += 1
      }
      out.append(w)
      i += ss.length
      replaced = true
    }

    while (i < s.length) {
      tryReplace("&amp;", '&')
      tryReplace("&lt;", '<')
      tryReplace("&gt;", '>')
      tryReplace("&quot;", '"')
      tryReplace("&#x27;", '\'')
      tryReplace("&#x2F;", '/')
      if (!replaced) {
        val j = s.indexOf('&', i + 1)
        if (j < 0) {
          out.append(s, i, s.length)
          i = s.length
        } else {
          out.append(s, i, j)
          i = j
        }
      } else replaced = false

    }

    out.toString
  }

  def replace(s: String, what: String, wit: String): String = {
    var i = s.indexOf(what)
    if (i < 0) return s

    val sb = new StringBuilder(s.length * 2)
    sb.append(s, 0, i)
    sb.append(wit)
    i += what.length

    while (i < s.length) {
      val j = s.indexOf(what, i)
      if (j < 0) {
        sb.append(s, i, s.length)
        i = s.length
      } else {
        sb.append(s, i, j)
        sb.append(wit)
        i = j + what.length
      }
    }
    sb.toString
  }
}
