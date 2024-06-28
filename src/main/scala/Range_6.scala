/*
6)Multiple Range Check:
Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
Sample Data:
Number: 25
 */

object Range_6 {
  def main(args:Array[String]):Unit={
    val num =25
    val num1=8
    val num2=18

    def checkRange( a:Int):Unit={
      if( ((a>=1) && (a<=10)) || ((a>=20) && (a<=30)) )
        println(s"The number $a is in the either of ranges")
      else
        println(s"The numer $a is not in either of ranges")
    }
    checkRange(num)
    checkRange(num1)
    checkRange(num2)
  }

}
