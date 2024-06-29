/*
11)Check for Prime AND Odd Number:
Write a Scala function to check if a given number is both a prime number and an odd number.
Sample Data:
Number: 17
 */
object PrimeAndOdd {

  def main(args:Array[String]):Unit={
    val num =10
    val num1=17

    def checkprimeOdd(n:Int):Unit={
      if( (n==1) || (n==3))
      {
        println(s"The number $n is prime and odd")
        return
      }
      else {
        for (i <- 2 to n) {
          if (n % i == 0) {
            println(s"The number $n is not prime")
            return ""
          }
          else {
            println(s"The num $n is prime and odd")
            return ""
          }
        }
      }

      }
    checkprimeOdd(num)
    checkprimeOdd(num1)


    }

  }

