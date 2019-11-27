package Loop20191127
//for的值可以被返回但需要加yield
object For1 {
  def main(args: Array[String]): Unit = {
    val list =for(i <- 1 until(10)) yield i
      println(list)
  }
}
