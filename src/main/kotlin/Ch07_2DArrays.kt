

//2D Arrays: Array of arrays


fun main() {

    val matrix2 = Array(3) {
        IntArray(3)
    }

    val matrix = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
    )

    //0 1 2

    //1 2 3  => 0
    //4 5 6  => 1
    //7 8 9  => 2
    println(matrix.contentDeepToString())
    println(matrix[1][1])

    val rowSize = matrix.size
    val colSize = matrix[0].size

    println(rowSize)
    println(colSize)

}