/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/convert-array-list-to-linked-list
@Language: Java
@Datetime: 17-05-16 01:13
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
     * @param nums an integer array list
     * @return the first node of linked list
     */
    public ListNode toLinkedList(ArrayList<Integer> nums) {  
        // Write your code here
        if (nums.size() == 0) {
            ListNode head = null;
            return head;
        }
        ListNode head = new ListNode(nums.get(0));
        ListNode tail = head;
        for (int i = 1; i < nums.size(); ++i) {
            tail.next = new ListNode(nums.get(i));
            tail = tail.next;
        }
        return head;
    }
}
