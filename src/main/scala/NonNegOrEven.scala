/*
10)Check for Non-Negative OR Even Number:
Create a Scala program to check if a given number is either non-negative or even.
Sample Data:
Number: -8
 */
object NonNegOrEven {

  def main(args:Array[String]):Unit={
    val num= -10
    val num1= 8
    val num2= 7

    def checkNegOrEven(n:Int):Unit={
      if ( (n>=0) && (n%2!=0) )
        println(s"The number $n is non negative and not even")
      else if((n<0) && (n%2==0))
        println(s"The num $n is even and negative")
      else
        println(s"The number $n is either even and non negative")
      }
    checkNegOrEven(num)
    checkNegOrEven(num1)
    checkNegOrEven(num2)
  }

}
