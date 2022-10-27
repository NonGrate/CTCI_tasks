package q1_arrays

class q1_8_ZeroMatrix {
    fun q1_8_zeroMatrix(input: Array<Array<String>>): Array<Array<String>> {
        println("Input array:")
        printArray(input)

        if (input.isEmpty()) {
            return arrayOf()
        }

        val zeroRows = mutableSetOf<Int>()
        val zeroColumns = mutableSetOf<Int>()

        for (rowIndex in input.indices) {
            for (columnIndex in input.indices) {
                if (input[rowIndex][columnIndex] == "0") {
                    zeroRows.add(rowIndex)
                    zeroColumns.add(columnIndex)
                }
            }
        }

        val result: Array<Array<String>> = Array(input.size) { Array(input.size) { "_" } }

        println("Generated result array:")
        printArray(result)

        for (rowIndex in input.indices) {
            for (columnIndex in input.indices) {
                if (zeroRows.contains(rowIndex) || zeroColumns.contains(columnIndex)) {
                    result[rowIndex][columnIndex] = "0"
                } else {
                    result[rowIndex][columnIndex] = input[rowIndex][columnIndex]
                }
                println("Updated result array:")
                printArray(result)
            }
        }


        println("Final result array:")
        printArray(result)

        return result
    }

    private fun printArray(input: Array<Array<String>>) {
        input.forEach {
            print("| ")
            print(it.joinToString(separator = " "))
            println("| ")
        }
    }
}