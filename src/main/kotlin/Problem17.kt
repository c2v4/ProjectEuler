fun toWord(n: Int):String {
    return when (n) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        7 -> "seven"
        8 -> "eight"
        9 -> "nine"
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        14 -> "fourteen"
        15 -> "fifteen"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        20 -> "twenty"
        30 -> "thirty"
        40 -> "forty"
        50 -> "fifty"
        60 -> "sixty"
        70 -> "seventy"
        80 -> "eighty"
        90 -> "ninety"
        in 21 until 100 -> toWord((n / 10) * 10) + "-" + toWord(n % 10)
        100, 200, 300, 400, 500, 600, 700, 800, 900 -> toWord(n / 100) + " hundred"
        in 101 until 1000 -> toWord((n / 100) * 100) + " and " + toWord(n % 100)
        1000 -> toWord(n / 1000) + " thousand"
        else -> {
            throw IllegalArgumentException("Dunno number")
        }
    }
}

fun main(args: Array<String>) {
    (1..1000).asSequence().map { toWord(it).replace(" ","").replace("-","") }.sumBy { it.length }.let(::println)
}