package leetcode.zigZag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testZigzag() {
        Solution solution = new Solution();
        
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3), "Failed for 'PAYPALISHIRING' with 3 rows");
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4), "Failed for 'PAYPALISHIRING' with 4 rows");
        assertEquals("A", solution.convert("A", 1), "Failed for 'A' with 1 row");
    }
}
