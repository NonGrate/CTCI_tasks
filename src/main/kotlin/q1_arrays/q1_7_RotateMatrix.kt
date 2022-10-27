package q1_arrays

class q1_7_RotateMatrix {
    fun q1_7_rotateMatrix_1_clockwise(input: Array<Array<String>>): Array<Array<String>> {
        println("Rotating:")
        printArray(input)

        if (input.isEmpty()) {
            return arrayOf()
        }

        val result: Array<Array<String>> = Array(input.size) { Array(input.size) { "_" } }

        println("Generated result array:")
        printArray(result)

        for (rowIndex in input.indices) {
            for (columnIndex in input.indices) {
                result[columnIndex][input.size - rowIndex - 1] = input[rowIndex][columnIndex]
                println("Updated result array:")
                printArray(result)
            }
        }


        println("Final result array:")
        printArray(result)

        return result
    }

    fun q1_7_rotateMatrix_2_counterclockwise(input: Array<Array<String>>): Array<Array<String>> {
        println("Rotating:")
        printArray(input)

        if (input.isEmpty()) {
            return arrayOf()
        }

        val result: Array<Array<String>> = Array(input.size) { Array(input.size) { "_" } }

        println("Generated result array:")
        printArray(result)

        for (rowIndex in input.indices) {
            for (columnIndex in input.indices) {
                result[input.size - columnIndex - 1][rowIndex] = input[rowIndex][columnIndex]
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