package main.br.com.s2it.ex8

import java.util.stream.IntStream

class CompletingNumbers(a:Int, b:Int) {
  var aLen = 1 + Math.floor(Math.log10(a)).toInt
  var bLen = 1 + Math.floor(Math.log10(b)).toInt
  var len = aLen + bLen
  var c = StringBuilder.newBuilder

  def numComplete(): Int = {
    if (6 < len) {
      return -1
    }

    IntStream.range(0, len).forEach(i => {
        if (i < aLen) c.append(String.valueOf(a).charAt(i))
        if (i < bLen) c.append(String.valueOf(b).charAt(i))
      }
    )

    return c.toString.toInt
  }

}
