package q1_arrays

class q1_9_StringRotation {
    fun q1_9_stringRotation(input1: String, input2: String): Boolean {
        println("Checking $input2 is a rotation of the $input1:")

        if (input1.length != input2.length) {
            return false
        }

        if (input2.isEmpty()) {
            return true
        }

        return (input1 + input1).contains(input2)
    }
}