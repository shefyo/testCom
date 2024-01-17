import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun testVisa() {
        val type = "Visa"
        val previous = 0
        val transfer = 1000

        val result = commission(cardType = type, previousTransfer = previous, transfer = transfer)

        assertEquals(1000, result)
    }
    @Test
    fun testVisaMonthLimit() {
        val type = "Visa"
        val previous = 0
        val transfer = 1000000

        val result = commission(cardType = type, previousTransfer = previous, transfer = transfer)

        assertEquals(-2, result)
    }
    @Test
    fun testVisaDayLimit() {
        val type = "Visa"
        val previous = 0
        val transfer = 500000

        val result = commission(cardType = type, previousTransfer = previous, transfer = transfer)

        assertEquals(-100, result)
    }

    @Test
    fun testWrongType() {
        val type = "UnionPay"
        val previous = 0
        val transfer = 1000000

        val result = commission(cardType = type, previousTransfer = previous, transfer = transfer)

        assertEquals(-1, result)
    }

}
