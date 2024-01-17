import kotlin.math.max


const val ERROR_TYPE = -1
const val ERROR_LIMIT = -2

fun main() {
    println(commission("Мир", 1000, 500))
}

fun commission(cardType: String, previousTransfer: Int, transfer: Int): Int {
    return when(cardType) {
        "Visa", "Мир" -> if (previousTransfer + transfer <= 600_000 && transfer <= 150_000) {
            max(35, (transfer + 0.0075).toInt())
        } else {
            ERROR_LIMIT
        }
        else -> ERROR_TYPE
    }
}