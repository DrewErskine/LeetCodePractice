package leetcode.testLinkedListCycle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import leetcode.LinkedListCycle.ListNode;
import leetcode.LinkedListCycle.Solution;

public class SolutionTest {

    @Test
    public void testLinkedListCycle() {
        Solution solution = new Solution(); // Correctly instantiate Solution
        
        // Test case 1: head = [3,2,0,-4], pos = 1
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // creates a cycle, pos = 1
        
        assertEquals(true, solution.hasCycle(node1), "Failed for head = [3,2,0,-4], pos = 1");

        // Test case 2: head = [1,2], pos = 0
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        node5.next = node6;
        node6.next = node5; // creates a cycle, pos = 0
        
        assertEquals(true, solution.hasCycle(node5), "Failed for head = [1,2], pos = 0");

        // Test case 3: head = [1], pos = -1 (no cycle)
        ListNode node7 = new ListNode(1);
        
        assertEquals(false, solution.hasCycle(node7), "Failed for head = [1], pos = -1");
    }
}