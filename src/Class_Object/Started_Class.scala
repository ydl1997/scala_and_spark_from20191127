package Class_Object

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
