import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem14Test{

    @Test
    fun numberOfSequenceTermsTest(){
        assertThat(getNumberOfSequenceTerms()(13)).isEqualTo(10)
    }
}