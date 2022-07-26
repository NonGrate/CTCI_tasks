package arrays

class IsUnique1_1 {
    fun isUnique1_1_1_list(input: String): Boolean {
        val control = mutableListOf<Char>()

        for (char in input) {
            if (control.contains(char)) {
                return false
            }
            control.add(char)
        }
        return true
    }

    fun isUnique1_1_2_set(input: String): Boolean {
        val length = input.length

        return length == input.toSet().size
    }

    fun isUnique1_1_3_iteration(input: String): Boolean {
        for (i in input.indices) {
            for (j in i + 1 until input.length) {
                if (input[i] == input[j]) return false
            }
        }

        return true
    }
}