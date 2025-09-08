package pro.kotlin.basic

// Main entry point
fun main() {
    println("Hello PRO!")  // Console output

    // Immutable (val = can't be reassigned)
    val number1 = 1

    // Mutable (var = can change anytime)
    var myAge = 25
    println(myAge)

    myAge = 19  // reassign works
    println(myAge)

    // Explicit type (Byte)
    var myNewAge: Byte = 20
    println(myNewAge)

    // Kotlin auto-picks numeric types
    var myLongAge = 20123456789   // Long
    var myIntAge = 201234         // Int
    var myShortAge: Short = 31000 // Short: -32k → 32k


    // Floats & Doubles
    var pi = 3.14                 // Double by default
    pi = 3.1415926535
    println(pi)

    var pif = 3.14f               // Float (needs "f")
    pif = 3.1415926535f           // precision capped
    println(pif)                  // → 3.1415927


    // Unsigned ints (positive-only)
    var uShortAge = 35u  // UInt
    println(uShortAge)


    // Booleans + logic ops
    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse)  // OR → true
    println(myTrue && myFalse)  // AND → false
    println(!myTrue)            // NOT → false


    // Chars (Unicode-ready)
    val myChar = 'a'
    println(myChar)

    val myUniChar = '\u00AE'  // "®"
    println(myUniChar)


    // Strings
    var name = ""
    println(name)  // empty string

    var newName = "PRO"
    var lastName = "error"
    println(newName)

    newName = "UPS"
    println(newName)

    println(newName.lowercase())  // string method
    println("\t$newName is my name :) $lastName \nTry again!")


    // If/else example
    val ageIs = 22
    if (ageIs >= 18) {
        println("Come in!")
    } else {
        println("Too young!")
    }


    // Grab input from user
    println("Enter your age:")
    var ageIn = readln().toInt()  // string → int

    if (ageIn >= 18) {
        println("Come in!")
    } else {
        println("Too young!")
    }


    // If / else-if chain
    var ageIf = readln().toInt()

    if (ageIf in 18..<40) {       // range check
        println("Come in!")
    } else if (ageIf >= 40) {
        println("Go home, please.")
    } else {
        println("Too young!")
    }

    /* Alt version:
    if (ageIf >= 40) {
        println("Go home, please.")
    } else if (ageIf <= 18) {
        println("Too young!")
    } else {
        println("Come in!")
    }
     */

    //if (ageIf in 18..<40) { ... }   // half-open range
    //if (ageIf in 18..40) { ... }    // closed range

    // rangeTo extension
    val range = 1.rangeTo(5 )
    println(range)         // prints 1..5
    println(3 in range)    // true

}
