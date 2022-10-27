package q1_arrays

class q1_1_IsUnique {
    fun q1_1_isUnique_1_list(input: String): Boolean {
        val control = mutableListOf<Char>()

        for (char in input) {
            if (control.contains(char)) {
                return false
            }
            control.add(char)
        }
        return true
    }

    fun q1_1_isUnique_2_set(input: String): Boolean {
        val length = input.length

        return length == input.toSet().size
    }

    fun q1_1_isUnique_3_iteration(input: String): Boolean {
        for (i in input.indices) {
            for (j in i + 1 until input.length) {
                if (input[i] == input[j]) return false
            }
        }

        return true
    }
}