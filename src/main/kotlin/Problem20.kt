import arrow.syntax.function.memoize
import java.math.BigInteger
fun factorial(number:BigInteger): BigInteger {
    var factorial = { n: BigInteger -> n }
    factorial = { n: BigInteger -> if(n == BigInteger.ZERO) BigInteger.ONE else n * factorial(n - BigInteger.ONE) }.memoize()
    return factorial(number)
}

fun sumOfFactorialsDigits(n:Int) = factorial(BigInteger(n.toString())).toString().toCharArray().map { it - '0' }.sum()

fun main(args: Array<String>) {
    print(sumOfFactorialsDigits(100))
}