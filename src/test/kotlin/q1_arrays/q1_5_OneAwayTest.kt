package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_5_OneAway

class q1_5_OneAwayTest {

    private val q1_5_Oneaway = q1_5_OneAway()

    @Test
    fun q1_5_test_oneAway() {
        Assertions.assertTrue(q1_5_Oneaway.q1_5_oneAway("pale", "pale"), "pale->pale")
        Assertions.assertTrue(q1_5_Oneaway.q1_5_oneAway("pale", "ple"), "pale->ple")
        Assertions.assertFalse(q1_5_Oneaway.q1_5_oneAway("pale", "pe"), "pale->pe")
        Assertions.assertTrue(q1_5_Oneaway.q1_5_oneAway("pales", "pale"), "pales->pale")
        Assertions.assertTrue(q1_5_Oneaway.q1_5_oneAway("pale", "pales"), "pale->pales")
        Assertions.assertTrue(q1_5_Oneaway.q1_5_oneAway("pale", "bale"), "pale->bale")
        Assertions.assertFalse(q1_5_Oneaway.q1_5_oneAway("pale", "bake"), "pale->bake")
        Assertions.assertFalse(q1_5_Oneaway.q1_5_oneAway("pale", "plae"), "pale->plae")
    }
}