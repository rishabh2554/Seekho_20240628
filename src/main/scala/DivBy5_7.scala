/*
9)Divisibility by 5 AND 7:
Write a Scala function to check if a given number is divisible by both 5 and 7.
Sample Data:
Number: 35
 */
object DivBy5_7 {
  def main(args:Array[String]):Unit={

    val num = 10
    val num1 = 35

    def div5n7(n:Int):Unit={
      if((n%5==0) && (n%7==0))
        println(s"The number $n is divisible by 5 and 7")
      else
        println(s"The number $n is not divisible by 5 and/or 7")
    }
    div5n7(num)
    div5n7(num1)

  }
}
