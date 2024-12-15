fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    // The solution: use the safe call operator ?. and the elvis operator ?: to handle the null case
    val nullableList: List<Int>? = null
    val nullableResult = nullableList?.map { it * 2 } ?: emptyList()
    println(nullableResult) // Output: []

    //Another solution using let
    val nullableResult2 = nullableList?.let { it.map { it * 2 } } ?: emptyList()
    println(nullableResult2) // Output: []
} 