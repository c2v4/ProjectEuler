import java.math.BigInteger

fun main(args: Array<String>) {
    BigInteger.valueOf(2).pow(1000).toString().toCharArray().map { it - '0' }.sum().let(::println)
}