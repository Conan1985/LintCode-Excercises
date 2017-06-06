/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/binary-tree-level-sum
@Language: Java
@Datetime: 17-06-06 00:00
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
     * @param level the depth of the target level
     * @return an integer
     */
    public int levelSum(TreeNode root, int level) {
        // Write your code
        if (root == null || level <= 0) {
            return sum;
        }
        traverseHelper(root, 1, level);
        return sum;
    }
    private void traverseHelper(TreeNode node, int currentLevel, int level) {
        if (currentLevel == level) {
            sum += node.val;
        }
        if (node.left == null && node.right == null) {
            return;
        }
        if (node.left != null) {
            traverseHelper(node.left, currentLevel + 1, level);
        }
        if (node.right != null) {
            traverseHelper(node.right, currentLevel + 1, level);
        }
    }
}