package arrays

class URLify1_3 {
    fun urlify1_3_1_simple(input: String): String {
        return input.replace(" ", "%20")
    }

    fun urlify1_3_2_inplace(input: String): String {
        val result = input.map { it.toString() }.toMutableList()

        val iterator: MutableListIterator<String> = result.listIterator()

        while (iterator.hasNext()) {
            if (iterator.next() == " ") {
                iterator.set("%20")
            }
        }
        return result.joinToString(separator = "")
    }

    fun urlify1_3_3_clone(input: String): String {
        val builder = StringBuilder()
        input.forEach {
            if (it == ' ') {
                builder.append("%20")
            } else {
                builder.append(it)
            }
        }

        return builder.toString()
    }
}