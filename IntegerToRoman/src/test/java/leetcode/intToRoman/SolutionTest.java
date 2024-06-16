package leetcode.intToRoman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testIntToRoman() {
        Solution solution = new Solution();

        // Example 1
        assertEquals("MMMDCCXLIX", solution.intToRoman(3749));

        // Example 2
        assertEquals("LVIII", solution.intToRoman(58));

        // Example 3
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    public void testIntToRomanWithOtherValues() {
        Solution solution = new Solution();

        // Additional test cases
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("XL", solution.intToRoman(40));
        assertEquals("XC", solution.intToRoman(90));
        assertEquals("CD", solution.intToRoman(400));
        assertEquals("CM", solution.intToRoman(900));
        assertEquals("XXVII", solution.intToRoman(27));
        assertEquals("I", solution.intToRoman(1));
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}
