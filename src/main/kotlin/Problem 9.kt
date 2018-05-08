fun main(args: Array<String>) {
    print((1..995).asSequence().flatMap { a -> ((a + 1)..997).asSequence().map { b -> Triple(a, b, Math.sqrt(((a * a) + (b * b)).toDouble()).toInt()) }.filter { (a, b, c) -> a * a + b * b == c * c } }.find { (a, b, c) -> a + b + c == 1000 }?.let { (a, b, c) -> a * b * c })
}