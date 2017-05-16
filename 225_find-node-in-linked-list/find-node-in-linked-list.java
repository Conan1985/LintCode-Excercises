/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/find-node-in-linked-list
@Language: Java
@Datetime: 17-05-15 00:55
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
     * @param val: an integer
     * @return: a linked node or null
     */
    public ListNode findNode(ListNode head, int val) { 
        // Write your code here
        while (head != null  && head.val != val) {
            head = head.next;
        }
        return head;
    }  
}