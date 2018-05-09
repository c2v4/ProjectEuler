import arrow.syntax.function.memoize
import javax.swing.text.html.HTML.Attribute.N

private fun nextCollatz(n: Long) = if (n.isEven()) n / 2 else 3 * n + 1

fun getNumberOfSequenceTerms(): (Long) -> Long {
    var numberOfSequenceTerms: (Long) -> Long = { it }
    numberOfSequenceTerms = { n: Long -> if (n == 1L) 1 else 1 + numberOfSequenceTerms(nextCollatz(n)) }.memoize()
    return numberOfSequenceTerms
}

private fun Long.isEven() = this % 2 == 0L


fun main(args: Array<String>) {
    (1 until 1_000_000L).maxBy(getNumberOfSequenceTerms()).let(::println)
}