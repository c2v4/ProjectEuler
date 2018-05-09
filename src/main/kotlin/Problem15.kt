import arrow.syntax.function.memoize
import javax.swing.text.html.HTML.Attribute.N

fun latticeStepCounter(size: Pair<Int, Int>): Long {
    var stepsToFinishLattice: (Pair<Int, Int>) -> Long = { 0L }
    stepsToFinishLattice = { (x, y): Pair<Int, Int> ->
        if ((x == size.first && y == size.second-1)||(x == size.first-1 && y == size.second)) 1L
        else (
                (if (x < size.first) stepsToFinishLattice(x + 1 to y) else 0)
                        +
                        (if (y < size.second) stepsToFinishLattice(x to y + 1) else 0)
                )
    }.memoize()
    return stepsToFinishLattice(0 to 0)
}

fun main(args: Array<String>) {
    println(latticeStepCounter(20 to 20))
}