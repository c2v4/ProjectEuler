infix fun <P> ((P) -> Boolean).or(f: ((P) -> Boolean)) = { arg: P -> this(arg) || f(arg) }
infix fun <P> ((P) -> Boolean).and(f: ((P) -> Boolean)) = { arg: P -> this(arg) && f(arg) }

val isMultipleOf = { multiple: Number, number: Number -> number.toLong() % multiple.toLong() == 0L }