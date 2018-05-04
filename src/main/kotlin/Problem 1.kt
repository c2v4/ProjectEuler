import arrow.syntax.function.curried

private val isMultipleOfCurried = isMultipleOf.curried()

private val isMultipleOf3 = isMultipleOfCurried(3)
private val isMultipleOf5 = isMultipleOfCurried(5)

private val isMultipleOf3or5 = isMultipleOf3 or isMultipleOf5

private val allMultipliesBelow = { multiplyFilter: ((Int) -> Boolean),upperBound:Int -> (1 until upperBound).filter(multiplyFilter) }

val allMultiplesOf3or5Below = allMultipliesBelow.curried()(isMultipleOf3or5)

val sumOfAllMultiplesOf3or5Below = { i:Int -> allMultiplesOf3or5Below(i).sum()}

fun main(args: Array<String>) {
    print(sumOfAllMultiplesOf3or5Below(1000))
}