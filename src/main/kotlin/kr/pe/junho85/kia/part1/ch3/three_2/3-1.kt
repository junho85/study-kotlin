package kr.pe.junho85.kia.part1.ch3.three_2

fun main() {
    fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
    ): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }
        result.append(postfix)
        return result.toString()
    }

    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))
}