package leetcode.JumpGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testCanJump() {
        Solution solution = new Solution();
        
        // Test case 1: nums = [2,3,1,1,4]
        int[] nums1 = {2, 3, 1, 1, 4};
        assertEquals(true, solution.canJump(nums1), "Failed for nums = [2,3,1,1,4]");
        
        // Test case 2: nums = [3,2,1,0,4]
        int[] nums2 = {3, 2, 1, 0, 4};
        assertEquals(false, solution.canJump(nums2), "Failed for nums = [3,2,1,0,4]");
    }
}