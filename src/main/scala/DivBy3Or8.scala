/*
13)Divisibility by 3 OR 8:
Write a Scala function to check if a given number is divisible by either 3 or 8.
Sample Data:
Number: 24
 */
object DivBy3Or8 {
  def main(args:Array[String]):Unit={

    val num = 24
    val num1 = 35

    def checkdiv3Or8(n:Int):Unit={
      if((n%3==0) || (n%8==0))
        println(s"The number $n is either divisible by 3 or 8")
      else
        println(s"The number $n is not divisible by 3 and 8 ")
    }
    checkdiv3Or8(num)
    checkdiv3Or8(num1)

  }

}
