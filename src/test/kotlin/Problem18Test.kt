import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Problem18Test{
    
    @Test
    fun maxPathTest(){
        assertThat(maxPath("3\n" +
                "7 4\n" +
                "2 4 6\n" +
                "8 5 9 3")).isEqualTo(23)
    }
}