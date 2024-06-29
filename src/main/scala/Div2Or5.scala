/*
16)Check for Divisibility by 2 OR 5:
Write a Scala function to check if a given number is divisible by either 2 or 5.
Sample Data:
SEEKHO BIGDATA INSTITUTE
Number: 25
 */
object Div2Or5 {
  def main(args:Array[String]):Unit={

    val num = 30
    val num1 = 37

    def checkdiv2Or5(n:Int):Unit={
      if((n%2==0) || (n%5==0))
        println(s"The number $n is either divisible by 2 or 5")
      else
        println(s"The number $n is not divisible by 2 and 5 ")
    }
    checkdiv2Or5(num)
    checkdiv2Or5(num1)

  }

}
