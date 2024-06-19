package leetcode.lengthLargestWord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testLengthOfLargestWord() {
        Solution solution = new Solution();

        //empty string
        assertEquals(0, solution.lengthOfLargestWord(""));

        //single word
        assertEquals(4, solution.lengthOfLargestWord("word"));

        //multiple words
        assertEquals(5, solution.lengthOfLargestWord("The quick brown fox"));

        //leading and trailing spaces
        assertEquals(5, solution.lengthOfLargestWord("  space front and end "));

        //multiple spaces between words
        assertEquals(6, solution.lengthOfLargestWord("many    spaces in  here"));
    }
}
