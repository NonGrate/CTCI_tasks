import arrays.CheckPermutation1_2
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CheckPermutation1_2Test {

    private val checkPermutation12 = CheckPermutation1_2()

    @Test
    fun test_checkPermutation1_2_1() {
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_1_sort("abc", "abc"))
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_1_sort("abc", "bca"))
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_1_sort("abccc", "cbcac"))
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_1_sort("asbjip;lgcty", "asbjip;lgcty"))
        Assertions.assertFalse(checkPermutation12.checkPermutation1_2_1_sort("asbjip;lgcty", "asbjip;lgctz"))
    }

    @Test
    fun test_checkPermutation1_2_2() {
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_2_equals("abc", "abc"))
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_2_equals("abc", "bca"))
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_2_equals("abccc", "cbcac"))
        Assertions.assertTrue(checkPermutation12.checkPermutation1_2_2_equals("asbjip;lgcty", "asbjip;lgcty"))
        Assertions.assertFalse(checkPermutation12.checkPermutation1_2_2_equals("asbjip;lgcty", "asbjip;lgctz"))
    }
}