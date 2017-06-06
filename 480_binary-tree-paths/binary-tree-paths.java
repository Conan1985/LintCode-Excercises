/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/binary-tree-paths
@Language: Java
@Datetime: 17-06-06 02:31
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
    StringBuilder path = new StringBuilder();
    List<String> result = new ArrayList<>();
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        if (root == null) {
            return result;
        }
        travel(root);
        return result;
    }
    private void travel(TreeNode node) {
        if (path.length() == 0) {
            path.append(node.val);
        } else {
            path.append("->");
            path.append(node.val);
        }
        if (node.left == null && node.right == null) {
            result.add(path.toString());
            return;
        }
        if (node.left != null) {
            travel(node.left);
            int len = String.valueOf(node.left.val).length();
            path.delete(path.length()-len-2, path.length());
        }
        if (node.right != null) {
            travel(node.right);
            int len = String.valueOf(node.right.val).length();
            path.delete(path.length()-len-2, path.length());
        }
    }
}