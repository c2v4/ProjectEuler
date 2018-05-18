import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem20Test{
    
    @Test
    fun sumOfFactorialsDigitsTest(){
        assertThat(sumOfFactorialsDigits(10)).isEqualTo(27)
    }
}