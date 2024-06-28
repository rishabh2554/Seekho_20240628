/*
1)Check for Even AND Positive Number:
Write a Scala function to check if a given number is both even and positive.
Sample Data:
Number: 14
 */

object Even_Positive {

  def main(args: Array[String]): Unit = {
    val a = 14

    def even_positive(num: Int): Unit = {
      if (num > 0 && num % 2 == 0)
        println(s"The number $num is even and positive")
      else
        println(s"The number is not even and positive")
    }

    even_positive(a)
  }
}

