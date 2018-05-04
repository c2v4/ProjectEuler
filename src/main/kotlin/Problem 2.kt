import arrow.syntax.function.curried

private val isEven = isMultipleOf.curried()(2)

fun main(args: Array<String>) {
    print(generateSequence(1 to 1, { it.second to it.first + it.second }).map { it.first }
            .takeWhile { it < 4_000_000 }
            .filter(isEven)
            .sum())
}