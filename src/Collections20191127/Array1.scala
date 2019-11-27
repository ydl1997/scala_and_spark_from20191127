package Collections20191127

object Array1 {
  def main(args: Array[String]): Unit = {
    val a =Array[String]("1","2","3")
    for (i <- 0 until(a.length)){
      val b:String =a(i)
      println(b+" ")
    }
    println("--------------------------------------------")
    val a1 =a.iterator
    while(a1.hasNext){
      val b1 =a1.next()
      println(b1)
    }

  }
}
