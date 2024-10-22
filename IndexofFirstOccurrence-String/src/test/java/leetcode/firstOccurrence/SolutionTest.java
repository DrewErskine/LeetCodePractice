package leetcode.firstOccurrence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testStrStr() {
        Solution solution = new Solution();
        
        // Test case 1: haystack = "sadbutsad", needle = "sad"
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        assertEquals(0, solution.strStr(haystack1, needle1), "Failed for haystack = 'sadbutsad', needle = 'sad'");
        
        // Test case 2: haystack = "leetcode", needle = "leeto"
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        assertEquals(-1, solution.strStr(haystack2, needle2), "Failed for haystack = 'leetcode', needle = 'leeto'");
    }
}