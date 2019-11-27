package Class_Object20191127

import scala.io.StdIn

object Started_Class {
  def main(args: Array[String]): Unit = {
    val person =new Create_Class
    while(true)
    {
      person.name()
      person.ageadd()
    }
  }
}
