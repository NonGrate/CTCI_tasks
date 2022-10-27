package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_3_URLify

class q1_3_URLifyTest {

    private val q1_3_urlify = q1_3_URLify()

    @Test
    fun q1_3_test_urlify_1() {
        Assertions.assertEquals("abc", q1_3_urlify.q1_3_urlify_1_simple("abc"))
        Assertions.assertEquals("%20abc", q1_3_urlify.q1_3_urlify_1_simple(" abc"))
        Assertions.assertEquals("%20abc%20", q1_3_urlify.q1_3_urlify_1_simple(" abc "))
        Assertions.assertEquals("ab%20%20ccc", q1_3_urlify.q1_3_urlify_1_simple("ab  ccc"))
        Assertions.assertEquals("a%20b%20%20c%20%20%20d%20%20%20%20", q1_3_urlify.q1_3_urlify_1_simple("a b  c   d    "))
    }

    @Test
    fun q1_3_test_urlify_2() {
        Assertions.assertEquals("abc", q1_3_urlify.q1_3_urlify_2_inplace("abc"))
        Assertions.assertEquals("%20abc", q1_3_urlify.q1_3_urlify_2_inplace(" abc"))
        Assertions.assertEquals("%20abc%20", q1_3_urlify.q1_3_urlify_2_inplace(" abc "))
        Assertions.assertEquals("ab%20%20ccc", q1_3_urlify.q1_3_urlify_2_inplace("ab  ccc"))
        Assertions.assertEquals("a%20b%20%20c%20%20%20d%20%20%20%20", q1_3_urlify.q1_3_urlify_2_inplace("a b  c   d    "))
    }

    @Test
    fun q1_3_test_urlify_3() {
        Assertions.assertEquals("abc", q1_3_urlify.q1_3_urlify_3_clone("abc"))
        Assertions.assertEquals("%20abc", q1_3_urlify.q1_3_urlify_3_clone(" abc"))
        Assertions.assertEquals("%20abc%20", q1_3_urlify.q1_3_urlify_3_clone(" abc "))
        Assertions.assertEquals("ab%20%20ccc", q1_3_urlify.q1_3_urlify_3_clone("ab  ccc"))
        Assertions.assertEquals("a%20b%20%20c%20%20%20d%20%20%20%20", q1_3_urlify.q1_3_urlify_3_clone("a b  c   d    "))
    }
}