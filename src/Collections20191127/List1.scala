package Collections20191127

//list
object List1 {
  def main(args: Array[String]): Unit = {
    val l1 = List(
      10
      , 20
      , 40
      , 50
      , 100
    )
    //遍历 foreach
    val k2 = l1.foreach { i2 => println(i2) }
    println("-----------------------------------")
    //list常用方法
    //filter
    val k3 = l1.filter { x => x <= 50 }.foreach(x => println(x))
    //map
    val l2 = List(
      "ssd sddd"
      , "deff ffa"
      , "gggs ikjl")
    val k4: List[Array[String]] = l2.map(x => x.split(" "))
    val mapresult =k4.foreach{x =>println(x)}
  }
}
