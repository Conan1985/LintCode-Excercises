/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height
@Language: Java
@Datetime: 17-06-07 19:32
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
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        TreeNode root = null;
        if (A.length == 0) {
            return root;
        }
        int len = A.length;
        root = recursiveTravel(root, 1, len, A);
        return root;
    }
    private TreeNode recursiveTravel(TreeNode node, int lhs, int rhs, int[] A) {
        if (lhs <= rhs) {
            int mid = (lhs + rhs) >> 1;
            node = new TreeNode(A[mid-1]);
            node.left = recursiveTravel(node.left, lhs, mid - 1, A);
            node.right = recursiveTravel(node.right, mid + 1, rhs, A);
        }
        return node;
    }
}
