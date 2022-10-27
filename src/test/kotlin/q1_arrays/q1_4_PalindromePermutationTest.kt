package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_4_PalindromePermutation

class q1_4_PalindromePermutationTest {

    private val q1_4_palindromePermutation = q1_4_PalindromePermutation()

    @Test
    fun q1_4_test_palindromePermutation_1() {
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("aba"), "aba")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("abba"), "abba")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("Tact Coa"), "Tact Coa")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("tact coa"), "tact coa")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("ABCCBA"), "ABCCBA")
        Assertions.assertFalse(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("EXAMPLE"), "EXAMPLE")
        Assertions.assertFalse(q1_4_palindromePermutation.q1_4_palindromePermutation_1_lazy("Tact Cod"), "Tact Cod")
    }

    @Test
    fun q1_4_test_palindromePermutation_2() {
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("aba"), "aba")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("abba"), "abba")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("Tact Coa"), "Tact Coa")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("tact coa"), "tact coa")
        Assertions.assertTrue(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("ABCCBA"), "ABCCBA")
        Assertions.assertFalse(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("EXAMPLE"), "EXAMPLE")
        Assertions.assertFalse(q1_4_palindromePermutation.q1_4_palindromePermutation_2_hashmap("Tact Cod"), "Tact Cod")
    }
}