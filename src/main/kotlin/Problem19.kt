import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.time.temporal.TemporalAmount
import java.time.temporal.TemporalUnit
import java.util.*

fun sundays(from: LocalDate, to: LocalDate) = Sequence({LocalDateIterator(from,to, ChronoUnit.MONTHS)}).count { it.withDayOfMonth(1).dayOfWeek == DayOfWeek.SUNDAY }

class LocalDateIterator(from: LocalDate, private val to: LocalDate, private val increment: TemporalUnit) : Iterator<LocalDate> {

    var current: LocalDate = from

    override fun hasNext(): Boolean = current.plus(1, increment) <= to

    override fun next(): LocalDate {
        current = current.plus(1, increment)
        return current
    }

}

fun main(args: Array<String>) {
    print(sundays(LocalDate.of(1901,1,1),LocalDate.of(2000,12,31)))
}