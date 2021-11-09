import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

internal class florTest {
    val flor = flor()

    @org.junit.jupiter.api.Test
    fun loveFun() {
        assertTrue(flor.loveFun(1, 4))
        assertFalse(flor.loveFun(2, 2))
        assertTrue(flor.loveFun(0, 1))
        assertFalse(flor.loveFun(0, 0))

    }
}