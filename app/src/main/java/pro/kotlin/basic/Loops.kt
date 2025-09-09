package pro.kotlin.basic

fun main()
{
    var count = 0

    /*
    while(true)
    {
        // so long this content will be executed
    }
    */

    while(count < 3)
    {
        println("Count is $count")
        count++  // count = count + 1, code count
    }
    println("Loop is done!")

    var userInput = readln()
    while(userInput == "1")
    {
        println("While loop executed")
        //break
        readln()
    }
    println("Loop is done!")

}