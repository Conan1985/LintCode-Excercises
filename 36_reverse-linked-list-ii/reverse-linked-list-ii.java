/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/reverse-linked-list-ii
@Language: Java
@Datetime: 17-05-18 18:53
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
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        if (head == null || head.next == null) {
            return head;
        }
        if (m == n) {
            return head;
        }
        ListNode nodeM = head;
        ListNode nodeN = head;
        for (int i = 1; i < m; i++) {
            nodeM = nodeM.next;
            nodeN = nodeN.next;
        }
        Stack st = new Stack();
        st.push(nodeN.val);
        for (int i = 1; i <= n - m; i++) {
            nodeN = nodeN.next;
            st.push(nodeN.val);
        }
        while (!st.empty()) {
            nodeM.val = (int)st.pop();
            nodeM = nodeM.next;
        }
        
        return head;
    }
}