package Loop20191127
//if语句练习
import scala.io.StdIn

object If1 {
  def main(args: Array[String]): Unit = {
    while (true) {
      val number = StdIn.readInt()
      if (number < 18 && number > 0) {
        println("未成年")
      }
      else if (number >= 18) {
        println("成年")
      }
      else {
        println("错误代码，无法识别")
      }

    }
  }
}
