/*
7)Check for Negative AND Odd Number:
Implement a Scala program to check if a given number is both negative and odd.
Sample Data:
Number: -7
 */

object CheckNegativeOdd {
  def main(args:Array[String]):Unit={

    val num = -10
    val num1 = -9
    val num2 =2

    def checkNgeOdd(a:Int):Unit={
      if ( (a<0) && (a%2!=0) )
        println(s"The number $a is negative and odd")
      else
        println(s"The number $a is either not negative or not odd")
    }
    checkNgeOdd(num)
    checkNgeOdd(num1)
    checkNgeOdd(num2)

  }

}
