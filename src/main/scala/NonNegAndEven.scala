/*
14)Check for Non-Positive AND Even Number:
Implement a Scala program to check if a given number is both non-positive and even.
Sample Data:
Number: -6
 */

object NonNegAndEven {
  def main(args:Array[String]):Unit={
    val num= -10
    val num1= 8
    val num2= 7

    def checkNegAndEven(n:Int):Unit={
      if ( (n>=0) && (n%2==0) )
        println(s"The number $n is non negative and even")
      else if((n<0) && (n%2==0))
        println(s"The num $n is even and negative")
      else
        println(s"The number $n is either not even or negative")
    }
    checkNegAndEven(num)
    checkNegAndEven(num1)
    checkNegAndEven(num2)
  }


}
