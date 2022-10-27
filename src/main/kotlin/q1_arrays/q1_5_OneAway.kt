package q1_arrays

import kotlin.math.abs

class q1_5_OneAway {
    fun q1_5_oneAway(input1: String, input2: String): Boolean {
        if (abs(input1.length - input2.length) > 1) return false

        if (input1.length == input2.length) {
            var diff = 0
            for (i in input1.indices) {
                if (input1[i] != input2[i]) {
                    diff++
                }
            }

            return diff < 2
        }

        val firstLonger = input1.length > input2.length
        var missedChar = false
        for (i in if (firstLonger) input2.indices else input1.indices) {
            val index1 = i + (if (firstLonger && missedChar) 1 else 0)
            val index2 = i + (if (!firstLonger && missedChar) 1 else 0)
            println("comparing: ${input1[index1]} to ${input2[index2]}")
            if (input1[index1] != input2[index2]) {
                if (missedChar) {
                    return false
                }

                if (firstLonger && input1[index1 + 1] != input2[index2]) {
                    println("comparing1: ${input1[index1 + 1]} to ${input2[index2]}")
                    return false
                } else if (firstLonger && input1[index1] != input2[index2 + 1]) {
                    println("comparing2: ${input1[index1]} to ${input2[index2 + 1]}")
                    return false
                }

                missedChar = true
            }
        }

        return true
    }
}