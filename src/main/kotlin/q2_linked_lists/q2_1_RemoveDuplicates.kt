package q2_linked_lists

class q2_1_RemoveDuplicates {
    fun q2_1_removeDuplicates_1_buffer(input: LinkedList): LinkedList {

        // TODO REFACTOR!!!

        println("Filtering duplicates out from $input")
        val buffer = mutableSetOf(input.value)

        var tmpHead: LinkedList = input
        var tmpNext: LinkedList? = input.next

        while(tmpNext != null) {
            println("Buffer is: $buffer")
            println("Checking the tmpHead $tmpHead")

            println("Checking the tmpNext $tmpNext")
            while (tmpNext != null && buffer.contains(tmpNext.value)) {
                println("${tmpNext.value} is not unique. Skipping")
                tmpNext = tmpNext.next
            }

            if (tmpNext == null) {
                tmpHead.next = tmpNext
                break
            }

            println("Adding ${tmpNext.value} to the buffer")
            buffer.add(tmpNext.value)

            println("Current tmpNext is: $tmpNext")
            tmpHead.next = tmpNext
            println("TmpHead is: $tmpHead")

            println("Current input is: $input")
            println()
            tmpHead = tmpHead.next!!
        }

        println("Result: $input")

        return input
    }

    fun q2_1_removeDuplicates_2_no_buffer(input: String): Boolean {
        // TODO use two pointers and n^2
        val length = input.length

        return length == input.toSet().size
    }
}