/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/remove-nth-node-from-end-of-list
@Language: Java
@Datetime: 17-05-15 20:15
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if (n < 0) {
            return null;
        }
        if (n == 0) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode dummyHead = head;
        head = dummy;
        for (int i = 1; i <= n; i++) {
            dummyHead = dummyHead.next;
        }
        while (dummyHead != null) {
            dummyHead = dummyHead.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return head.next;
    }
}
