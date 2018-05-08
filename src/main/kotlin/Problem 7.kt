internal fun primeGenerator() = generateSequence(2){it+1}.filter(::isPrime)

val firstNthPrime = {n:Int -> primeGenerator().elementAt(n-1)}

fun main(args: Array<String>) {
    print(firstNthPrime(10_001))
}