package Loop20191127

object For_Varargs {
  def main(args: Array[String]): Unit = {
    def sumData(ii:Int*){
      var sum =0
        for(i <- ii){
          sum+=i
          println(sum)
        }
    }
  }

}
