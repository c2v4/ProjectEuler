import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem7Test{
    
    @Test
    fun firstNthPrimeTest(){
        assertThat(firstNthPrime(6)).isEqualTo(13)
    }
}