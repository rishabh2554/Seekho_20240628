/*
20)Divisibility by 5 OR 9:
Write a Scala program to check if a given number is divisible by either 5 or 9.
Sample Data:
Number: 45
 */
object Div5Or9 {
  def main(args:Array[String]):Unit={
    val num = 45
    val num1 = 35
    val num2 = 37

    def checkdiv5Or9(n:Int):Unit={
      if((n%5==0) || (n%9==0))
        println(s"The number $n is either divisible by 5 or 9 ")
      else
        println(s"The number $n is not divisible by 5 and 9 ")
    }
    checkdiv5Or9(num)
    checkdiv5Or9(num1)
    checkdiv5Or9(num2)
  }
}
