package pro.kotlin.basic

fun main ()
{
    while (true)
    {
        println("Please enter a number:")
        val inputString = readln()

        while (inputString.toIntOrNull() != null)
        {
            val inputNumber = inputString.toInt()

            val multiplier = 7
            var operaResult = multiplier * inputNumber

            println("$inputNumber x $multiplier = $operaResult")
            break
        }
        println("Invalid input")
    }

}