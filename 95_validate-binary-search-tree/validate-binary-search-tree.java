/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/validate-binary-search-tree
@Language: Java
@Datetime: 17-06-09 22:14
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    boolean result = true;
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        return divideConq(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean divideConq(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return divideConq(root.left, min, Math.min(root.val, max)) &&
            divideConq(root.right, Math.max(min, root.val), max);
    }
}