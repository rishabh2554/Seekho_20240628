/*
5)Eligibility for Voting OR Driving:
Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
eligible to drive (age greater than or equal to 16).
Sample Data:
Age: 20
 */

object CheckDrivingVoting {
  def main(args:Array[String]):Unit={
    val age1=19
    val age2=17
    val age3=15

    def checkDrivVote(age:Int):Unit={
      if(age>=16)
        if(age>=18)
          println(s"The age $age is eligible for voting and driving")
        else
          println(s"The age $age is eligible for driving but not voting")
      else
        println(s"The age $age is not eligible for voting and driving")
     }
    checkDrivVote(age1)
    checkDrivVote(age2)
    checkDrivVote(age3)
  }

}
