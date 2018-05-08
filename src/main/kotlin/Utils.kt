infix fun <P> ((P) -> Boolean).or(f: ((P) -> Boolean)) = { arg: P -> this(arg) || f(arg) }
infix fun <P> ((P) -> Boolean).and(f: ((P) -> Boolean)) = { arg: P -> this(arg) && f(arg) }

val isLongMultipleOf = { multiple: Long, number: Long -> number % multiple == 0L }
val isMultipleOf = { multiple: Int, number: Int -> isMultiple(multiple, number) }

internal fun isPrime(n: Int) = (2..(n / 2)).none { divisor: Int -> isMultiple(divisor, n) }
internal fun isMultiple(multiple: Int, number: Int) = number % multiple == 0
internal fun isMultiple(multiple: Long, number: Long) = number % multiple == 0L