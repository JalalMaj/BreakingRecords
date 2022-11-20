fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var maxTotal = 0
    var minTotal = 0
    var max = 0
    var min = 0

    for (x in 0 until scores.size) {
        val it = scores[x]
        if (x != 0) {
            if (it > max) {
                max = it
                maxTotal++
            }
            else if (it < min) {
                min = it
                minTotal++
            }

        } else {
            max = it
            min = it
        }
    }
    return listOf(maxTotal, minTotal).toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
