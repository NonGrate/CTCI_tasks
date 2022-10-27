package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class q1_9_StringRotationTest {

    private val q1_9_stringRotation = q1_9_StringRotation()

    @Test
    fun q1_9_test_stringRotation() {
        Assertions.assertTrue(q1_9_stringRotation.q1_9_stringRotation("waterbottle", "erbottlewat"))
        Assertions.assertFalse(q1_9_stringRotation.q1_9_stringRotation("aaa", "a"))
        Assertions.assertFalse(q1_9_stringRotation.q1_9_stringRotation("aaa", "aaaa"))
        Assertions.assertFalse(q1_9_stringRotation.q1_9_stringRotation("abc", "acb"))
        Assertions.assertTrue(q1_9_stringRotation.q1_9_stringRotation("abc", "cab"))
        Assertions.assertFalse(q1_9_stringRotation.q1_9_stringRotation("abc", "caa"))
    }
}