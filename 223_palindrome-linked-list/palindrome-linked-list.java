/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/palindrome-linked-list
@Language: Java
@Datetime: 17-05-18 15:19
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a boolean
     */
    public boolean isPalindrome(ListNode head) {
        // Write your code here
        Stack st = new Stack();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        boolean isPalin = true;
        if (head != null) {
            st.push(head.val);
        } else{
            return isPalin;
        }
        while (head.next != null) {
            if (head.next.val == (int)st.peek()) {
                break;
            }
            if (head.next.next != null && head.next.next.val == (int)st.peek()) {
                head = head.next;
                break;
            }
            head = head.next;
            st.push(head.val);
            if (head.next == null) {
                isPalin = false;
            }
        }
        while (head.next != null) {
            if (st.empty()) {
                isPalin = false;
                break;
            }
            int compare = (int)st.pop();
            if (head.next.val != compare) {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
}