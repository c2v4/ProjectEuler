fun triangleGenerator() = (0..Integer.MAX_VALUE).asSequence().map { (it * (it + 1)) / 2 }

fun firstTriangleNumberWithOverNDivisors(n: Int) = triangleGenerator().first { divisors(it).size > n }

fun divisors(n: Int)= (1..sqrt(n)).filter {
    isMultiple(it, n)
}.fold(mutableSetOf<Int>(), { acc, i ->
    acc.add(i)
    acc.add(n / i)
    acc
})

fun main(args: Array<String>) {
    print(firstTriangleNumberWithOverNDivisors(500))
}