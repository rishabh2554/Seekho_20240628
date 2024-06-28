/*
8)Eligibility for Senior Discount OR Student Discount:
Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
60) or a student discount (age less than 25).
Sample Data:
Age: 63
 */

object DiscountEligibility {
  def main(args:Array[String]):Unit={
    val age1= 26
    val age2= 20
    val age3 = 62

    def checkEligibility( age:Int):Unit={
      if(age< 25)
        println(s"The age $age is eleigible for Student discount")
      else if(age>60)
        println(s"The age $age is eligible for Senior discount")
      else
        println(s"The age $age is not eligible for any discount")
    }
    checkEligibility(age1)
    checkEligibility(age2)
    checkEligibility(age3)
  }

}
