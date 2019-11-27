package Loop20191127
//scala中的特殊用法 to 和 until to包含输入的所有值 until不包含最后
object To_And_Until {
  def main(args: Array[String]): Unit = {
    println(1 to 10)
    println(1.to(10))
    println(1 until(10))
    println(1.until(10))
    println(1 to(10,2))//2是步长
  }
}
