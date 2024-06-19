package leetcode.lengthLastWord;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testlengthOfLastWord() {

        Solution solution = new Solution();

        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(3, solution.lengthOfLastWord("III"));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
