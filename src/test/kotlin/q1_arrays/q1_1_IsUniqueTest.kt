package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_1_IsUnique

class q1_1_IsUniqueTest {

    private val q1_1_isUnique = q1_1_IsUnique()

    @Test
    fun q1_1_test_isUnique_1() {
        Assertions.assertTrue(q1_1_isUnique.q1_1_isUnique_1_list("abc"))
        Assertions.assertTrue(q1_1_isUnique.q1_1_isUnique_1_list("asbjip;lgcty"))
        Assertions.assertFalse(q1_1_isUnique.q1_1_isUnique_1_list("asbjip;lgctya"))
    }

    @Test
    fun q1_1_test_isUnique_2() {
        Assertions.assertTrue(q1_1_isUnique.q1_1_isUnique_2_set("abc"))
        Assertions.assertTrue(q1_1_isUnique.q1_1_isUnique_2_set("asbjip;lgcty"))
        Assertions.assertFalse(q1_1_isUnique.q1_1_isUnique_2_set("asbjip;lgctya"))
    }

    @Test
    fun q1_1_test_isUnique_3() {
        Assertions.assertTrue(q1_1_isUnique.q1_1_isUnique_3_iteration("abc"), "abc")
        Assertions.assertTrue(q1_1_isUnique.q1_1_isUnique_3_iteration("asbjip;lgcty"), "asbjip;lgcty")
        Assertions.assertFalse(q1_1_isUnique.q1_1_isUnique_3_iteration("asbjip;lgctya"), "asbjip;lgctya")
    }
}