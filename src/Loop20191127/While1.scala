package Loop20191127

import scala.io.StdIn

object While1 {
  def main(args: Array[String]): Unit = {
    val a = StdIn.readInt()
    while (a > 10) {
      println("right")
    }
  }
}
