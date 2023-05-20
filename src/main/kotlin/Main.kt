fun pascalTriangle(n: Int): List<List<Int>> {
    val triangle = mutableListOf<List<Int>>()


    for (row in 0 until  n) {

        val currentRow = mutableListOf<Int>()


        for (col in 0..row) {

            if (col == 0 || col == row) {

                currentRow.add(1)
            } else {

                val previousRow = triangle[row - 1]
                val sum = previousRow[col - 1] + previousRow[col]
                currentRow.add(sum)
            }
        }

        triangle.add(currentRow)
    }

    return triangle
}

fun main() {

    val n = 12

    val pascalTriangle = pascalTriangle(n)

    for (row in pascalTriangle) {
        println(row.joinToString(" "))
    }
}
