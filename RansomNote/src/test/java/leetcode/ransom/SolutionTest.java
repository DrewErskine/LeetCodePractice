package leetcode.ransom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testRansom() {
        Solution solution = new Solution();
        
        assertFalse(solution.canConstruct("aa", "b"));
        assertTrue(solution.canConstruct("aa", "aab"));
    }
}
