/*
15)Age Group Classification with AND:
Create a Scala program to classify a person's age group. Classify them as a child (less than 13),
teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
Sample Data:
Age: 15
 */
object AgeClassification {
def main(args:Array[String]):Unit={
  val age1=12
  val age2= 18
  val age3= 22

  def checkAgeClass(age:Int):Unit={
    if( age<13)
      println(s"The age $age  belongs to Child")
    else if( (age>=13) && (age<=19))
      println(s"The age $age  belongs to Teenager")
    else
      println(s"The age $age  belongs to Adult")
  }
  checkAgeClass(age1)
  checkAgeClass(age2)
  checkAgeClass(age3)
}



}
