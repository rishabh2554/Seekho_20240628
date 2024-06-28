/*
2)Range Check with OR:
Create a Scala program to determine if a given value is either less than -10 or greater than 10.
Sample Data:
Value: -15
 */

object Range_10 {

  def main(args:Array[String]):Unit={

    val num = 9
    val num1= 19
    def range10(a:Int):Unit={

      if ((a< -10) || (a> 10))
      println(s"The number $a is in range")
      else
      println(s"The number $a is not in range")

    }

    range10(num)
    range10(num1)

  }

}
