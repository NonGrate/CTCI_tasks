package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_8_ZeroMatrix

class q1_8_ZeroMatrixTest {

    private val q1_8_zeroMatrix = q1_8_ZeroMatrix()

    @Test
    fun q1_8_test_zeroMatrix() {
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("0", "0", "0", "0", "0"),
                arrayOf("0", "g", "0", "i", "j"),
                arrayOf("0", "0", "0", "0", "0"),
                arrayOf("0", "q", "0", "s", "t"),
                arrayOf("0", "v", "0", "x", "y"),
            ),
            q1_8_zeroMatrix.q1_8_zeroMatrix(
                arrayOf(
                    arrayOf("0", "b", "c", "d", "e"),
                    arrayOf("f", "g", "h", "i", "j"),
                    arrayOf("k", "l", "0", "n", "o"),
                    arrayOf("p", "q", "r", "s", "t"),
                    arrayOf("u", "v", "w", "x", "y"),
                )
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("a", "0", "c", "d"),
                arrayOf("e", "0", "g", "h"),
                arrayOf("i", "0", "k", "l"),
                arrayOf("0", "0", "0", "0"),
            ),
            q1_8_zeroMatrix.q1_8_zeroMatrix(
                arrayOf(
                    arrayOf("a", "b", "c", "d"),
                    arrayOf("e", "f", "g", "h"),
                    arrayOf("i", "j", "k", "l"),
                    arrayOf("m", "0", "o", "p"),
                )
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("a", "b", "c", "d"),
                arrayOf("e", "f", "g", "h"),
                arrayOf("i", "j", "k", "l"),
                arrayOf("m", "n", "o", "p"),
            ),
            q1_8_zeroMatrix.q1_8_zeroMatrix(
                arrayOf(
                    arrayOf("a", "b", "c", "d"),
                    arrayOf("e", "f", "g", "h"),
                    arrayOf("i", "j", "k", "l"),
                    arrayOf("m", "n", "o", "p"),
                )
            )
        )
    }
}