// type your solution here

fun main(args: Array<String>) {
    val temperature = 37.5
    val count: Int = 5
    var name = "Santhosh"

    name = "Chandrasekharan"

    fun calculateTemperature(celsius: Double): Double {
        return 9/5 * celsius + 32
    }

    println("Temp = ${calculateTemperature(20.0)}")
    println("Temp = ${calculateTemperature(50.0)}")

    val intValue = "32".toInt()
    println("intValue = $intValue")

    val intString = 32.toString()
    println("intString = $intString")

    val fahrenheit = 32
    when (fahrenheit) {
        in 0..30 -> println("Really Cold")
        in 31..40 -> println("Getting Colder")
        in 41..50 -> println("Kind of Cold")
        in 51..60 -> println("Nippy")
        in 71..80 -> println("just Right")
    }

    val nullableName: String? = null
    val length = nullableName?.length ?: -1
    println("Length = $length")

}