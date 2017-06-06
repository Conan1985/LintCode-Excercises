/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/minimum-depth-of-binary-tree
@Language: Java
@Datetime: 17-06-06 03:06
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
    int min = Integer.MAX_VALUE;
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        travel(root, 1);
        return min;
    }
    private void travel(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            if (depth < min) {
                min = depth;
            }
            return;
        }
        if (node.left != null) {
            travel(node.left, depth+1);
        }
        if (node.right != null) {
            travel(node.right, depth+1);
        }
    }
}