import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem10Test{

    @Test
    fun sumOfPrimesBelowTest(){
        assertThat(sumOfPrimesBelow(10)).isEqualTo(17)
    }
}