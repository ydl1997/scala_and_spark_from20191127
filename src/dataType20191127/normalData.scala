package dataType20191127
//scala中的基本类型
object normalData {
  def main(args: Array[String]): Unit = {
    val B1:Byte = -128
    val B2:Byte =  127
    println("Byte的范围是"+B1+" -- "+B2)
    val S1:Short = -32768
    val S2:Short =  32767
    println("Short的范围是"+S1+" -- "+S2)
    val I1:Int = -2147483648
    val I2:Int =  2147483647
    println("Int的范围是"+I1+" -- "+I2)

  }
}
