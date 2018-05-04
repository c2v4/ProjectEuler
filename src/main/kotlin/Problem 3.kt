import arrow.syntax.function.curried
import arrow.syntax.function.reverse

val isPrime = { n: Long -> (2..(n / 2)).none { divisor: Long -> isMultipleOf(divisor, n) } }

val primeFactors = { n: Long -> primeFactorize(n, emptyList()) }

tailrec fun primeFactorize(n: Long, soFar: List<Long>): List<Long> {
    if (isPrime(n)) return soFar.plusElement(n)
    val primeDivisor = ((soFar.lastOrNull() ?: 2)..n).find(isPrime and isMultipleOf.reverse().curried()(n)) ?: 0
    return primeFactorize(n / primeDivisor, soFar.plusElement(primeDivisor))
}

fun main(args: Array<String>) {
    print(primeFactors(600851475143L).last())
}