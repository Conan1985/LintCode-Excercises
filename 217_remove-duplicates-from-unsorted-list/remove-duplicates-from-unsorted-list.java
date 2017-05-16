/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-unsorted-list
@Language: Java
@Datetime: 17-05-16 02:17
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
     * @param head: The first node of linked list.
     * @return: head node
     */
    public ListNode removeDuplicates(ListNode head) { 
        // Write your code here
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        HashSet hs = new HashSet();
        hs.add(head.val);
        while (head.next != null) {
            if (hs.contains(head.next.val)) {
                head.next = head.next.next;
            } else {
                hs.add(head.next.val);
                head = head.next;
            }
        }
        return tail;
    }  
}