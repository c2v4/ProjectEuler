val smallestMultiple = { n: Int -> (2..n).asSequence().fold(emptyList<Int>(), {
    acc, i ->
    acc + (acc.fold(primeFactors(i.toLong()).map { it.toInt() },{ acc2, i2 -> acc2.minusElement(i2) }))}
).fold(1, { acc, i -> acc * i }) }

fun main(args: Array<String>) {
    print(smallestMultiple(20))
}