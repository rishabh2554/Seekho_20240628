/*
4)Divisibility by 4 OR 6:
Write a Scala program to check if a given number is divisible by either 4 or 6.
Sample Data:
Number: 18
 */

object DivBy4Or6 {
  def main(args:Array[String]):Unit={
    val num = 12
    val num1 = 15
    def div4_6( a:Int):Unit={
      if ((a%4==0) || (a%6==0))
        println(s"The number $a is  divisible by either 4 or 6 ")
      else
        println(s"The number $a is not divisible by 4 and  6 ")
    }

    div4_6(num)
    div4_6(num1)
  }

}
