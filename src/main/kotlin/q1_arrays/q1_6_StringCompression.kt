package q1_arrays

import java.lang.StringBuilder

class q1_6_StringCompression {
    fun q1_6_stringCompression(input: String): String {
        if (input.isEmpty()) {
            return ""
        }
        val builder = StringBuilder()
        var currentChar = input[0]
        var counter = 1

        for (i in 1 until input.length) {
            if (input[i] == currentChar) {
                counter++
            } else {
                builder.append(currentChar)
                builder.append(counter)
                currentChar = input[i]
                counter = 1
            }
        }

        builder.append(currentChar)
        builder.append(counter)

        return builder.toString()
    }
}