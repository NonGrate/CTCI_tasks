package q1_arrays

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_7_RotateMatrix

class q1_7_RotateMatrixTest {

    private val q1_7_rotateMatrix = q1_7_RotateMatrix()

    @Test
    fun q1_7_test_rotateMatrix_1_clockwise() {
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("u", "p", "k", "f", "a"),
                arrayOf("v", "q", "l", "g", "b"),
                arrayOf("w", "r", "m", "h", "c"),
                arrayOf("x", "s", "n", "i", "d"),
                arrayOf("y", "t", "o", "j", "e"),
            ),
            q1_7_rotateMatrix.q1_7_rotateMatrix_1_clockwise(
                arrayOf(
                    arrayOf("a", "b", "c", "d", "e"),
                    arrayOf("f", "g", "h", "i", "j"),
                    arrayOf("k", "l", "m", "n", "o"),
                    arrayOf("p", "q", "r", "s", "t"),
                    arrayOf("u", "v", "w", "x", "y"),
                )
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("m", "i", "e", "a"),
                arrayOf("n", "j", "f", "b"),
                arrayOf("o", "k", "g", "c"),
                arrayOf("p", "l", "h", "d"),
            ),
            q1_7_rotateMatrix.q1_7_rotateMatrix_1_clockwise(
                arrayOf(
                    arrayOf("a", "b", "c", "d"),
                    arrayOf("e", "f", "g", "h"),
                    arrayOf("i", "j", "k", "l"),
                    arrayOf("m", "n", "o", "p"),
                )
            )
        )
    }

    @Test
    fun q1_7_test_rotateMatrix_2_counterclockwise() {
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("e", "j", "o", "t", "y"),
                arrayOf("d", "i", "n", "s", "x"),
                arrayOf("c", "h", "m", "r", "w"),
                arrayOf("b", "g", "l", "q", "v"),
                arrayOf("a", "f", "k", "p", "u"),
            ),
            q1_7_rotateMatrix.q1_7_rotateMatrix_2_counterclockwise(
                arrayOf(
                    arrayOf("a", "b", "c", "d", "e"),
                    arrayOf("f", "g", "h", "i", "j"),
                    arrayOf("k", "l", "m", "n", "o"),
                    arrayOf("p", "q", "r", "s", "t"),
                    arrayOf("u", "v", "w", "x", "y"),
                )
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("d", "h", "l", "p"),
                arrayOf("c", "g", "k", "o"),
                arrayOf("b", "f", "j", "n"),
                arrayOf("a", "e", "i", "m"),
            ),
            q1_7_rotateMatrix.q1_7_rotateMatrix_2_counterclockwise(
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