/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/implement-stack
@Language: Java
@Datetime: 17-05-22 20:33
*/

class Stack {
    private LinkedList ls = new LinkedList();
    
    // Push a new item into the stack
    public void push(int x) {
        // Write your code here
        ls.add(x);
    }

    // Pop the top of the stack
    public void pop() {
        // Write your code here
        ls.removeLast();
    }

    // Return the top of the stack
    public int top() {
        // Write your code here
        return (int)ls.getLast();
        
    }

    // Check the stack is empty or not.
    public boolean isEmpty() {
        // Write your code here
        if (ls.size() == 0) {
            return true;
        } else {
            return false;
        }
    }    
}