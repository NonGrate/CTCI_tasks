package q2_linked_lists

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import q1_arrays.q1_1_IsUnique

class q2_1_RemoveDuplicatesTest {

    private val q2_1_removeDuplicates = q2_1_RemoveDuplicates()

    @Test
    fun q2_1_test_removeDuplicates_1() {
        val input1 = LinkedList("a", LinkedList("b", LinkedList("a", LinkedList("c", LinkedList("b", LinkedList("a", null))))))
        val result1 = LinkedList("a", LinkedList("b", LinkedList("c", null)))

        val input2 = LinkedList("a", LinkedList("b", LinkedList("a", LinkedList("c", LinkedList("a", LinkedList("b", LinkedList("d", null)))))))
        val result2 = LinkedList("a", LinkedList("b", LinkedList("c", LinkedList("d", null))))

        val input3 = LinkedList("a", LinkedList("b", LinkedList("c", LinkedList("d", null))))
        val result3 = LinkedList("a", LinkedList("b", LinkedList("c", LinkedList("d", null))))

        val input4 = LinkedList("a", LinkedList("a", LinkedList("a", LinkedList("a", null))))
        val result4 = LinkedList("a", null)

        Assertions.assertEquals(result1, q2_1_removeDuplicates.q2_1_removeDuplicates_1_buffer(input1))
        Assertions.assertEquals(result2, q2_1_removeDuplicates.q2_1_removeDuplicates_1_buffer(input2))
        Assertions.assertEquals(result3, q2_1_removeDuplicates.q2_1_removeDuplicates_1_buffer(input3))
        Assertions.assertEquals(result4, q2_1_removeDuplicates.q2_1_removeDuplicates_1_buffer(input4))
    }
}