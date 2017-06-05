/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/binary-tree-path-sum
@Language: Java
@Datetime: 17-06-05 22:55
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
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
        if (root == null) {
            return result;
        }
        traverseHelper(root, root.val, target);
        return result;
    }
    private void traverseHelper(TreeNode node, int sum, int target) {
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (sum == target) {
                result.add(new ArrayList<Integer>(path));
            }
            return;
        }
        if (node.left != null) {
            traverseHelper(node.left, sum + node.left.val, target);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            traverseHelper(node.right, sum + node.right.val, target);
            path.remove(path.size() - 1);
        }
    }
}