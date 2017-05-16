/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/insert-node-in-sorted-linked-list
@Language: Java
@Datetime: 17-05-15 13:02
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
     * @param head: The head of linked list.
     * @param val: an integer
     * @return: The head of new linked list
     */
    public ListNode insertNode(ListNode head, int val) { 
        // Write your code here
        ListNode addPoint = new ListNode(val);
        ListNode cur = head;
        if (head == null) {
            head = addPoint;
        } else {
            while(cur.next != null && cur.next.val < val) {
                cur = cur.next;
            }
            if (cur.val < val) {
                addPoint.next = cur.next;
                cur.next = addPoint;
            } else {
                addPoint.next = cur;
                head = addPoint;
            }
        }
        return head;
    }  
}