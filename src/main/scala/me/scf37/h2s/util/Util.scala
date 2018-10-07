package me.scf37.h2s.util
import java.lang.StringBuilder

import org.htmlcleaner.Utils

object Util {

  // unescapes HTML, return None if HTML can't be fully unescaped
  def unescapeHtml(s: String): Option[String] = {
    val ss =  Utils.deserializeEntities(s, false)
    if (ss.indexOf("&#") < 0)
      Some(ss)
    else None
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
