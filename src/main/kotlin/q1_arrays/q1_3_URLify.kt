package q1_arrays

class q1_3_URLify {
    fun q1_3_urlify_1_simple(input: String): String {
        return input.replace(" ", "%20")
    }

    fun q1_3_urlify_2_inplace(input: String): String {
        val result = input.map { it.toString() }.toMutableList()

        val iterator: MutableListIterator<String> = result.listIterator()

        while (iterator.hasNext()) {
            if (iterator.next() == " ") {
                iterator.set("%20")
            }
        }
        return result.joinToString(separator = "")
    }

    fun q1_3_urlify_3_clone(input: String): String {
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