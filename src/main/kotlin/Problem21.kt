fun properDivisors(n:Int) = divisors(n) - n

fun isAmicable(a: Int): Boolean {
    val sum = properDivisors(a).sum()
    return properDivisors(sum).sum() == a && sum != a
}

fun main(args: Array<String>) {
    print((1..10000).filter { isAmicable(it) }.sum())
}