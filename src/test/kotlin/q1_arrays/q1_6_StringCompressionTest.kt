package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_6_StringCompression

class q1_6_StringCompressionTest {

    private val q1_6_stringCompression = q1_6_StringCompression()

    @Test
    fun q1_6_test_stringCompression() {
        Assertions.assertEquals("a2b1c5a3", q1_6_stringCompression.q1_6_stringCompression("aabcccccaaa"))
        Assertions.assertEquals("a1b1c1d1e1", q1_6_stringCompression.q1_6_stringCompression("abcde"))
        Assertions.assertEquals("a2b2c2d2e2", q1_6_stringCompression.q1_6_stringCompression("aabbccddee"))
        Assertions.assertEquals("a5b4c3d2e1", q1_6_stringCompression.q1_6_stringCompression("aaaaabbbbcccdde"))
        Assertions.assertEquals("a5", q1_6_stringCompression.q1_6_stringCompression("aaaaa"))
        Assertions.assertEquals("", q1_6_stringCompression.q1_6_stringCompression(""))
    }
}