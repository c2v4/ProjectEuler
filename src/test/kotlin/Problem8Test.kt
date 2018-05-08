import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem8Test{
    @Test
    fun findInTextNdigitWithGreatestProductFixedTest(){
        assertThat(findInTextNdigitWithGreatestProductFixed(4)).isEqualTo(5832)
    }
}