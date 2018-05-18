fun main(args: Array<String>) {
    val abundantNumbersBelow = abundantNumbersBelow(28123)
    val sum = abundantNumbersBelow.flatMap { n -> abundantNumbersBelow.map { n + it } }.toSet()
    print((1..28123).filter { !sum.contains(it) }.sum())
    
}

private fun abundantNumbersBelow(i: Int) = (1..(i)).filter { isAbundant(it) }

fun isAbundant(n: Int) = properDivisors(n).sum() > n

