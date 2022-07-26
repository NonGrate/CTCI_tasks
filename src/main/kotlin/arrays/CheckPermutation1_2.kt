package arrays

class CheckPermutation1_2 {
    fun checkPermutation1_2_1_sort(input1: String, input2: String): Boolean {
        if (input1.length != input2.length) return false

        val sorted1 = input1.toList().sorted()
        val sorted2 = input2.toList().sorted()

        for (i in sorted1.indices) {
            if (sorted1[i] != sorted2[i]) return false
        }

        return true
    }

    fun checkPermutation1_2_2_equals(input1: String, input2: String): Boolean {
        if (input1.length != input2.length) return false

        val sorted1 = input1.toList().sorted()
        val sorted2 = input2.toList().sorted()

        return sorted1 == sorted2
    }
}