import arrays.IsUnique1_1
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IsUnique1_1Test {

    private val isUnique11 = IsUnique1_1()

    @Test
    fun test_isUnique1_1_1() {
        Assertions.assertTrue(isUnique11.isUnique1_1_1_list("abc"))
        Assertions.assertTrue(isUnique11.isUnique1_1_1_list("asbjip;lgcty"))
        Assertions.assertFalse(isUnique11.isUnique1_1_1_list("asbjip;lgctya"))
    }

    @Test
    fun test_isUnique1_1_2() {
        Assertions.assertTrue(isUnique11.isUnique1_1_2_set("abc"))
        Assertions.assertTrue(isUnique11.isUnique1_1_2_set("asbjip;lgcty"))
        Assertions.assertFalse(isUnique11.isUnique1_1_2_set("asbjip;lgctya"))
    }

    @Test
    fun test_isUnique1_1_3() {
        Assertions.assertTrue(isUnique11.isUnique1_1_3_iteration("abc"), "abc")
        Assertions.assertTrue(isUnique11.isUnique1_1_3_iteration("asbjip;lgcty"), "asbjip;lgcty")
        Assertions.assertFalse(isUnique11.isUnique1_1_3_iteration("asbjip;lgctya"), "asbjip;lgctya")
    }
}