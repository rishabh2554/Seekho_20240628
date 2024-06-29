/*
22)Check for Divisibility by 3 AND 5:
Write a Scala function to check if a given number is divisible by both 3 and 5.
Sample Data:
Number: 15
 */

object DivBy3_5 {
  def main(args:Array[String]):Unit={

    val num = 15
    val num1 = 35

    def div5n3(n:Int):Unit={
      if((n%5==0) && (n%3==0))
        println(s"The number $n is divisible by 5 and 3")
      else
        println(s"The number $n is not divisible by 5 and/or 3")
    }
    div5n3(num)
    div5n3(num1)

  }
}
