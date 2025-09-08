package pro.kotlin.basic

fun main() {
    var circleRatio = 3.14  // Double
    println(circleRatio)

    var circleFloatRatio = 3.14f  // Float
    println(circleFloatRatio)

    circleFloatRatio =
        3.1415926535F  // too many significant digits x float, a limitation on the precision it can store
    println(circleFloatRatio)  // float

    circleRatio = 3.1415926535897932
    println(circleRatio)  // double

}


