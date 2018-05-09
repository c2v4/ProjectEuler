import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem15Test{

    @Test
    fun countLatticeStepsTest1() {
        assertThat(latticeStepCounter(1 to 1)).isEqualTo(2)
    }

    @Test
    fun countLatticeStepsTest2(){
        assertThat(latticeStepCounter(2 to 2)).isEqualTo(6)
    }
}