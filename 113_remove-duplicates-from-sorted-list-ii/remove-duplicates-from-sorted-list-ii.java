/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-sorted-list-ii
@Language: Java
@Datetime: 17-05-18 18:10
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
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        boolean identical = true;
        ListNode tail = head;
        if (head != null && head.next != null) {
            tail = head.next;
        } else {
            return head;
        }
        head = dummy;
        while (tail != null) {
            if (head.next.val != tail.val && identical) {
                head = head.next;
            } else if (head.next.val == tail.val) {
                head.next = tail;
                identical = false;
            } else if (head.next.val != tail.val && !identical) {
                head.next = tail;
                identical = true;
            }
            tail = tail.next;
        }
        if (!identical) {
            head.next = null;
        }
        return dummy.next;
    }
}
