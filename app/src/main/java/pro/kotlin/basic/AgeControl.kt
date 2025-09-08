package pro.kotlin.basic

fun main()
{
    var age = 0
    println("Enter your age as a whole number: ")
    age = readln().toInt()
    //if(age >= 18 && age <= 40)
    if (age in 18.rangeTo(39))  //Using Range Checks
    {
        println("You can enter the club.")
    }
    else if(age >= 40)
    {
        println("Please. Go Home. You cannot go into the club.")
    }
    else
    {
        println("Age not verified. Please contact support.")
    }

}