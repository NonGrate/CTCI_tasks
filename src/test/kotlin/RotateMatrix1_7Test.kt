import arrays.RotateMatrix1_7
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RotateMatrix1_7Test {

    private val rotateMatrix17 = RotateMatrix1_7()

    @Test
    fun test_rotateMatrix1_7_1_clockwise() {
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("u", "p", "k", "f", "a"),
                arrayOf("v", "q", "l", "g", "b"),
                arrayOf("w", "r", "m", "h", "c"),
                arrayOf("x", "s", "n", "i", "d"),
                arrayOf("y", "t", "o", "j", "e"),
            ),
            rotateMatrix17.rotateMatrix1_7_1_clockwise(
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
            rotateMatrix17.rotateMatrix1_7_1_clockwise(
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
    fun test_rotateMatrix1_7_1_counterclockwise() {
        Assertions.assertArrayEquals(
            arrayOf(
                arrayOf("e", "j", "o", "t", "y"),
                arrayOf("d", "i", "n", "s", "x"),
                arrayOf("c", "h", "m", "r", "w"),
                arrayOf("b", "g", "l", "q", "v"),
                arrayOf("a", "f", "k", "p", "u"),
            ),
            rotateMatrix17.rotateMatrix1_7_1_counterclockwise(
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
            rotateMatrix17.rotateMatrix1_7_1_counterclockwise(
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