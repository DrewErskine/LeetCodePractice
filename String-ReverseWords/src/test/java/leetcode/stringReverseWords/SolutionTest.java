package leetcode.stringReverseWords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testReverseWords() {
        Solution solution = new Solution();
        
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"), "Test failed for input: 'the sky is blue'");
        assertEquals("world hello", solution.reverseWords("  hello world  "), "Test failed for input: '  hello world  '");
        assertEquals("example good a", solution.reverseWords("a good   example"), "Test failed for input: 'a good   example'");
    }
}
