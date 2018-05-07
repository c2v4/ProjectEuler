import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Problem4Test{

    @Test
    fun `largest palindromic number from product of two 2-digit numbers is 9009`(){
        assertThat(largestPalindromicProductOf(2)).isEqualTo(9009)
    }


    @Test
    fun isAProductTest(){
        assertThat(isAProductOf(1,15)).isTrue()
        assertThat(isAProductOf(2,225)).isTrue()
        assertThat(isAProductOf(3,10_000)).isTrue()
        assertThat(isAProductOf(2,10_000)).isFalse()
        assertThat(isAProductOf(1,99)).isFalse()
        assertThat(isAProductOf(2,99)).isFalse()
    }

    @Test
    fun isAPalindromeTest(){
        assertThat(isAPalindrome("ada")).isTrue()
        assertThat(isAPalindrome("adda")).isTrue()
        assertThat(isAPalindrome("adba")).isFalse()
    }

    @Test
    fun isNumberAPalindromeTest(){
        assertThat(isNumberAPalindrome(99)).isTrue()
        assertThat(isNumberAPalindrome(9009)).isTrue()
        assertThat(isNumberAPalindrome(9089)).isFalse()
    }

}