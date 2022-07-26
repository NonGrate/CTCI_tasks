import arrays.OneAway1_5
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OneAway1_5Test {

    private val oneAway15 = OneAway1_5()

    @Test
    fun test_oneAway1_5_1() {
        Assertions.assertTrue(oneAway15.one_away1_5_1_("pale", "pale"), "pale->pale")
        Assertions.assertTrue(oneAway15.one_away1_5_1_("pale", "ple"), "pale->ple")
        Assertions.assertFalse(oneAway15.one_away1_5_1_("pale", "pe"), "pale->pe")
        Assertions.assertTrue(oneAway15.one_away1_5_1_("pales", "pale"), "pales->pale")
        Assertions.assertTrue(oneAway15.one_away1_5_1_("pale", "pales"), "pale->pales")
        Assertions.assertTrue(oneAway15.one_away1_5_1_("pale", "bale"), "pale->bale")
        Assertions.assertFalse(oneAway15.one_away1_5_1_("pale", "bake"), "pale->bake")
        Assertions.assertFalse(oneAway15.one_away1_5_1_("pale", "plae"), "pale->plae")
    }
}