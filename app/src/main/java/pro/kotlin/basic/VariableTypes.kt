package pro.kotlin.basic

fun main()
{
    val constantNumber = 1 //value will not change
    var mutableString = "Hi" //value can be reassigned or changed over time
    println("$constantNumber $mutableString")

    mutableString = "Ciao!"
    println(mutableString)

}