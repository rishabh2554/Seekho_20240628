import com.sun.prism.Texture
import sun.font.TrueTypeFont

/*
26)Eligibility for Senior Discount AND Not a New Customer:
Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
65) and is not a new customer.
Sample Data:
Age: 70
New Customer: false
 */
object CustomerSeniorDiscount {

  def main(args:Array[String]):Unit={
    val customer1=(55, false)
    val customer2=(67, true)
    val customer3=(68, false)

    def checkDiscountNewCustomer(a:(Int, Boolean)):Unit={
      if ((a._1>65) && (a._2 == true))
        println(s"The customer $a is eligible for senior citizen discount and is not a new customer")
      else if((a._1<=65) && (a._2 == false))
        println(s"The customer $a is not eligible for senior citizen discount and is a new customer")
      else
        println(s"The customer $a is either not eligible for senior citizen discount or  is a new customer")
        }
    checkDiscountNewCustomer(customer1)
    checkDiscountNewCustomer(customer2)
    checkDiscountNewCustomer(customer3)

  }

}
