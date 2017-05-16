/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/middle-of-linked-list
@Language: Java
@Datetime: 17-05-16 01:21
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) { 
        // Write your code here
        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int steps = 0;
        while (fast.next != null) {
            fast = fast.next;
            steps += 1;
        }
        int halfSteps = steps / 2;
        for (int i = 0; i < halfSteps; i++) {
            slow = slow.next;
        }
        return slow;
    }
}