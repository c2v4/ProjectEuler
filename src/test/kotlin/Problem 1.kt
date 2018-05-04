import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Problem1Test{

    @Test
    fun `multiples of 3 and 5 below 10 are 3,5,6 and 9`(){
        assertThat(allMultiplesOf3or5Below(10)).containsOnly(3,5,6,9)
    }

    @Test
    fun `sum of all multiples of 3 and 5 below 10 should be equal to 23`(){
        assertThat(sumOfAllMultiplesOf3or5Below(10)).isEqualTo(23)
    }
}