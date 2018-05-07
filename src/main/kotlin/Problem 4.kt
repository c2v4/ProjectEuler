import arrow.syntax.function.curried

val isAPalindrome = { str: String -> str == str.reversed() }

val isNumberAPalindrome = { n: Int -> isAPalindrome(n.toString()) }

val hasNDigits = {
    numberOfDigits: Int, numberToTest: Int -> numberToTest.toString().length == numberOfDigits
}
private val has2Digits = hasNDigits.curried()(2)

val isAProductOf = { numberOfDigits: Int, numberToTest: Int -> (Math.pow(10.0,numberOfDigits.toDouble()).toInt()-1).downTo(Math.pow(10.0,numberOfDigits.toDouble()-1).toInt()).asSequence()
        .filter {
            numberToTest % it == 0 && hasNDigits.curried()(numberOfDigits)(numberToTest / it)
        }
        .any() }


val largestPalindromicProductOf = { n: Int -> Math.pow(10.0, n.toDouble()+n).toInt().downTo(1).asSequence().filter(isNumberAPalindrome).filter(isAProductOf.curried()(n)).first() }

fun main(args: Array<String>) {
    print(largestPalindromicProductOf(3))
}