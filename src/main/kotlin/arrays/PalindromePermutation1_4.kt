package arrays

class PalindromePermutation1_4 {
    fun palindromePermutation1_4_1_lazy(input: String): Boolean {
        val sorted = input.replace(" ", "").toLowerCase().toList().sorted()

        println(sorted)

        var singleChars = 0

        var i = 0
        while (i < sorted.size - 1) {
            if (sorted[i] != sorted[i+1]) {
                println("${sorted[i]} != ${sorted[i+1]}")
                singleChars++
            } else {
                println("${sorted[i]} == ${sorted[i+1]}")
                i++
            }
            i++
        }

        println("singleChars: $singleChars")
        return singleChars < 2
    }

    fun palindromePermutation1_4_2_hashmap(input: String): Boolean {
        val hashmap = mutableMapOf<Char, Int>()

        input.forEach {
            if (it == ' ') return@forEach

            val lowercase = it.toLowerCase()
            if (hashmap.containsKey(lowercase)) {
                hashmap[lowercase] = hashmap[lowercase]!! + 1
            } else {
                hashmap[lowercase] = 1
            }
        }

        println("hashmap: $hashmap")
        return hashmap.values.filter { it % 2 != 0 }.size < 2
    }
}