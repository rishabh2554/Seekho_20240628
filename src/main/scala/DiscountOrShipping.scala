/*
12)Eligibility for Discount OR Free Shipping:
Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
than 150) or qualifies for free shipping (purchase amount greater than 100).
Sample Data:
Purchase Amount: 120
 */

object DiscountOrShipping {

  def main(args:Array[String]):Unit={

    val amt1 = 100
    val amt2 = 120
    val amt3 = 160

    def checkDiscountShipping( n:Int):Unit={
      if( (n>100) && (n<=150))
      println(s"The customer is eligible for fee shipping, amount: $n ")
      else if(n>150)
        println(s"The customer is eligible for discount, amount: $n ")
      else
        println(s"The customer is not eligible for any type of discount, amount: $n")
    }
    checkDiscountShipping(amt1)
    checkDiscountShipping(amt2)
    checkDiscountShipping(amt3)

  }
}
