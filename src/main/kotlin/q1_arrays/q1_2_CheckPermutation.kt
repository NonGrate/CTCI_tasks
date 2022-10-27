package q1_arrays

class q1_2_CheckPermutation {
    fun q1_2_checkPermutation_1_sort(input1: String, input2: String): Boolean {
        if (input1.length != input2.length) return false

        val sorted1 = input1.toList().sorted()
        val sorted2 = input2.toList().sorted()

        for (i in sorted1.indices) {
            if (sorted1[i] != sorted2[i]) return false
        }

        return true
    }

    fun q1_2_checkPermutation_2_equals(input1: String, input2: String): Boolean {
        if (input1.length != input2.length) return false

        val sorted1 = input1.toList().sorted()
        val sorted2 = input2.toList().sorted()

        return sorted1 == sorted2
    }
}