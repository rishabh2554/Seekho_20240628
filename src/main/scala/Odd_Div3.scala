/*
3)Odd Number Check with AND:
Implement a Scala function to check if a given number is odd and not divisible by 3.
Sample Data:
Number: 27
 */

object Odd_Div3 {
  def main(args:Array[String]):Unit={
    val num = 7
    val num1 = 15
    def checkOddDiv3( a:Int):Unit={
      if ((a%2!=0) & (a%3!=0))
        println(s"The number $a is odd and not divisible by 3 ")
      else
        println(s"The number $a is not add or divisble by 3 ")
    }

    checkOddDiv3(num)
    checkOddDiv3(num1)
  }

}
