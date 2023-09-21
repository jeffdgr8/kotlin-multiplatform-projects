import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class JvmTest {
    @Test
    fun `run test`() {
        assertTrue(true)
        assertEquals("42", 42.toString())
    }
}