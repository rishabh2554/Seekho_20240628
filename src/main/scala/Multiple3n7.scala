/*
19)Check for Multiple of 3 AND 7:
Implement a Scala function to check if a given number is both a multiple of 3 and 7.
Sample Data:
Number: 21
 */
object Multiple3n7 {
  def main(args:Array[String]):Unit={

    val num = 21
    val num1 = 35

    def checkMul3n7(n:Int):Unit={
      if((n%3==0) && (n%7==0))
        println(s"The number $n is a multiple of 3 and 7")
      else
        println(s"The number $n is not a multiple of 3 and 7")
    }
    checkMul3n7(num)
    checkMul3n7(num1)

  }

}
