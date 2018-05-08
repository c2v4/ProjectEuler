import kotlin.system.measureTimeMillis

fun sumOfPrimesBelow(n: Int) = (2L..n).fold(mutableListOf<Long>(), { acc, i ->
    val currentLimit = Math.sqrt(i.toDouble()).toLong()
    if (acc.asSequence().filter { it <= currentLimit }.none { isMultiple(it, i) }) {
        acc.add(i)
    }
    acc
}).sum()

fun main(args: Array<String>) {
    println(sumOfPrimesBelow(2_000_000))
}