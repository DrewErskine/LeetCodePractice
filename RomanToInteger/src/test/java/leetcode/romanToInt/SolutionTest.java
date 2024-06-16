package leetcode.romanToInt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testRomanToInt() {
        Solution solution = new Solution();

        // Example 1
        assertEquals(3, solution.romanToInt("III"));

        // Example 2
        assertEquals(58, solution.romanToInt("LVIII"));

        // Example 3
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void testRomanToIntWithOtherValues() {
        Solution solution = new Solution();

        // Additional test cases
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(40, solution.romanToInt("XL"));
        assertEquals(90, solution.romanToInt("XC"));
        assertEquals(400, solution.romanToInt("CD"));
        assertEquals(900, solution.romanToInt("CM"));
        assertEquals(27, solution.romanToInt("XXVII"));
    }
}

