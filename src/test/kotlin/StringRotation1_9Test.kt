import arrays.StringRotation1_9
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringRotation1_9Test {

    private val stringRotation19 = StringRotation1_9()

    @Test
    fun test_stringRotation1_9_1_() {
        Assertions.assertTrue(stringRotation19.stringRotation1_9_1_("waterbottle", "erbottlewat"))
        Assertions.assertFalse(stringRotation19.stringRotation1_9_1_("aaa", "a"))
        Assertions.assertFalse(stringRotation19.stringRotation1_9_1_("aaa", "aaaa"))
        Assertions.assertFalse(stringRotation19.stringRotation1_9_1_("abc", "acb"))
        Assertions.assertTrue(stringRotation19.stringRotation1_9_1_("abc", "cab"))
        Assertions.assertFalse(stringRotation19.stringRotation1_9_1_("abc", "caa"))
    }
}