package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_2_CheckPermutation

class q1_2_CheckPermutationTest {

    private val q1_2_checkPermutation = q1_2_CheckPermutation()

    @Test
    fun q1_2_test_checkPermutation_1() {
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_1_sort("abc", "abc"))
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_1_sort("abc", "bca"))
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_1_sort("abccc", "cbcac"))
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_1_sort("asbjip;lgcty", "asbjip;lgcty"))
        Assertions.assertFalse(q1_2_checkPermutation.q1_2_checkPermutation_1_sort("asbjip;lgcty", "asbjip;lgctz"))
    }

    @Test
    fun q1_2_test_checkPermutation_2() {
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_2_equals("abc", "abc"))
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_2_equals("abc", "bca"))
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_2_equals("abccc", "cbcac"))
        Assertions.assertTrue(q1_2_checkPermutation.q1_2_checkPermutation_2_equals("asbjip;lgcty", "asbjip;lgcty"))
        Assertions.assertFalse(q1_2_checkPermutation.q1_2_checkPermutation_2_equals("asbjip;lgcty", "asbjip;lgctz"))
    }
}