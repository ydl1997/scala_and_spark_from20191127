package Class_Object

import scala.io.StdIn

class Create_Class {
  val thing:String ="person"
  var age =18
  def name(): Unit ={
    print("输入姓名：")
    var names = StdIn.readLine()
    println("姓名是："+names)
  }
  def ageadd(): Unit ={
    age =age+1
    println("年龄增长到"+(age)+"岁")
  }
}
