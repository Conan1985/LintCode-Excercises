/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/insert-node-in-a-binary-search-tree
@Language: Java
@Datetime: 17-06-09 19:35
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
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (node == null) {
            return root;
        }
        root = recursivelyTravel(root, node);
        return root;
    }
    private TreeNode recursivelyTravel(TreeNode root, TreeNode node) {
        if (root == null) {
            return root = node;
        }
        if (root.val > node.val) {
            root.left = recursivelyTravel(root.left, node);
        }
        if (root.val <= node.val) {
            root.right = recursivelyTravel(root.right, node);
        }
        return root;
    }
}