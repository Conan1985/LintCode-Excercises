/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/binary-tree-leaf-sum
@Language: Java
@Datetime: 17-06-06 00:07
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
    int sum = 0;
    /**
     * @param root the root of the binary tree
     * @return an integer
     */
    public int leafSum(TreeNode root) {
        // Write your code 
        if (root == null) {
            return sum;
        }
        travel(root);
        return sum;
    }
    private void travel(TreeNode node) {
        if (node.left == null && node.right == null) {
            sum += node.val;
            return;
        }
        if (node.left != null) {
            travel(node.left);
        }
        if (node.right != null) {
            travel(node.right);
        }
    }
}