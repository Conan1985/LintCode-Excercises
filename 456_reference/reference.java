/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/reference
@Language: Java
@Datetime: 17-05-14 11:20
*/

/**
 * Definition of Node:
 * class Node {
 *     public int val;
 *     public Node(int val) {
 *         this.val = val;
 *     }
 * }
 */
public class ReferenceManager {
    public Node node;

    public void copyValue(Node obj) {
        // copy value from obj to node
        node = new Node();
        node.val = obj.val;
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
        node = new Node();
        node = obj;
    }
}