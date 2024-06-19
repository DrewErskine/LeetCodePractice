package leetcode.longestCommonPrefix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testLongestCommonPrefixExample1() {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};
        String expected = "fl";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "The longest common prefix for example 1 should be 'fl'");
    }

    @Test
    public void testLongestCommonPrefixExample2() {
        Solution solution = new Solution();
        String[] strs = {"dog","racecar","car"};
        String expected = "";
        String actual = solution.longestCommonPrefix(strs);
        assertEquals(expected, actual, "There should be no common prefix among the input strings for example 2");
    }
}
