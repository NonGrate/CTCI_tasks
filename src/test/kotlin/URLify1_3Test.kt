import arrays.URLify1_3
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class URLify1_3Test {

    private val urlify13 = URLify1_3()

    @Test
    fun test_urlify1_3_1() {
        Assertions.assertEquals("abc", urlify13.urlify1_3_1_simple("abc"))
        Assertions.assertEquals("%20abc", urlify13.urlify1_3_1_simple(" abc"))
        Assertions.assertEquals("%20abc%20", urlify13.urlify1_3_1_simple(" abc "))
        Assertions.assertEquals("ab%20%20ccc", urlify13.urlify1_3_1_simple("ab  ccc"))
        Assertions.assertEquals("a%20b%20%20c%20%20%20d%20%20%20%20", urlify13.urlify1_3_1_simple("a b  c   d    "))
    }

    @Test
    fun test_urlify1_3_2() {
        Assertions.assertEquals("abc", urlify13.urlify1_3_2_inplace("abc"))
        Assertions.assertEquals("%20abc", urlify13.urlify1_3_2_inplace(" abc"))
        Assertions.assertEquals("%20abc%20", urlify13.urlify1_3_2_inplace(" abc "))
        Assertions.assertEquals("ab%20%20ccc", urlify13.urlify1_3_2_inplace("ab  ccc"))
        Assertions.assertEquals("a%20b%20%20c%20%20%20d%20%20%20%20", urlify13.urlify1_3_2_inplace("a b  c   d    "))
    }

    @Test
    fun test_urlify1_3_3() {
        Assertions.assertEquals("abc", urlify13.urlify1_3_3_clone("abc"))
        Assertions.assertEquals("%20abc", urlify13.urlify1_3_3_clone(" abc"))
        Assertions.assertEquals("%20abc%20", urlify13.urlify1_3_3_clone(" abc "))
        Assertions.assertEquals("ab%20%20ccc", urlify13.urlify1_3_3_clone("ab  ccc"))
        Assertions.assertEquals("a%20b%20%20c%20%20%20d%20%20%20%20", urlify13.urlify1_3_3_clone("a b  c   d    "))
    }
}