val firstNthPrime = {n:Int -> generateSequence(2){it+1}.filter(isPrime).elementAt(n-1)}

fun main(args: Array<String>) {
    print(firstNthPrime(10_001))
}