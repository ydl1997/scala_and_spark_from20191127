package dataType20191127
//val定义常量，不可变
//var定义变量，可变
object val_and_var {
  def main(args: Array[String]): Unit = {
    val a:String ="test"
    println(a)
    var b:String="it can changed"
    println(b)
    b ="it changed again"
  }
}
