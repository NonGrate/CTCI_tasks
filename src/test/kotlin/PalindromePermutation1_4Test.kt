import arrays.PalindromePermutation1_4
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PalindromePermutation1_4Test {

    private val palindromePermutation14 = PalindromePermutation1_4()

    @Test
    fun test_palindromePermutation1_4_1() {
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_1_lazy("aba"), "aba")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_1_lazy("abba"), "abba")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_1_lazy("Tact Coa"), "Tact Coa")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_1_lazy("tact coa"), "tact coa")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_1_lazy("ABCCBA"), "ABCCBA")
        Assertions.assertFalse(palindromePermutation14.palindromePermutation1_4_1_lazy("EXAMPLE"), "EXAMPLE")
        Assertions.assertFalse(palindromePermutation14.palindromePermutation1_4_1_lazy("Tact Cod"), "Tact Cod")
    }

    @Test
    fun test_palindromePermutation1_4_2() {
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_2_hashmap("aba"), "aba")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_2_hashmap("abba"), "abba")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_2_hashmap("Tact Coa"), "Tact Coa")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_2_hashmap("tact coa"), "tact coa")
        Assertions.assertTrue(palindromePermutation14.palindromePermutation1_4_2_hashmap("ABCCBA"), "ABCCBA")
        Assertions.assertFalse(palindromePermutation14.palindromePermutation1_4_2_hashmap("EXAMPLE"), "EXAMPLE")
        Assertions.assertFalse(palindromePermutation14.palindromePermutation1_4_2_hashmap("Tact Cod"), "Tact Cod")
    }
}