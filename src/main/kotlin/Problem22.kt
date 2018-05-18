fun main(args: Array<String>) {
    print("p22names.txt".asResource().split(',').map { it.substring(1, it.length - 1) }.sorted().mapIndexed { index, s -> (index + 1) * alphabeticalValue(s) }.sum())
}

fun alphabeticalValue(s: String): Int = s.toCharArray().map { it - 'A' + 1 }.sum()
