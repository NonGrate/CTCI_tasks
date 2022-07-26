import arrays.StringCompression1_6
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringCompression1_6Test {

    private val stringCompression16 = StringCompression1_6()

    @Test
    fun test_stringCompression1_6_1() {
        Assertions.assertEquals("a2b1c5a3", stringCompression16.stringCompression1_6_1_("aabcccccaaa"))
        Assertions.assertEquals("a1b1c1d1e1", stringCompression16.stringCompression1_6_1_("abcde"))
        Assertions.assertEquals("a2b2c2d2e2", stringCompression16.stringCompression1_6_1_("aabbccddee"))
        Assertions.assertEquals("a5b4c3d2e1", stringCompression16.stringCompression1_6_1_("aaaaabbbbcccdde"))
        Assertions.assertEquals("a5", stringCompression16.stringCompression1_6_1_("aaaaa"))
        Assertions.assertEquals("", stringCompression16.stringCompression1_6_1_(""))
    }
}