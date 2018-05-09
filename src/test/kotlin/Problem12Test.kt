import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Problem12Test{

    @Test
    fun firstTriangleWithNDivisorsTest(){
        Assertions.assertThat(firstTriangleNumberWithOverNDivisors(5)).isEqualTo(28)
    }
}