package arrays

class StringRotation1_9 {
    fun stringRotation1_9_1_(input1: String, input2: String): Boolean {
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