/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/implement-queue-by-two-stacks
@Language: Java
@Datetime: 17-05-22 20:03
*/

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
       // do initialization if necessary
       stack1 = new Stack();
       stack2 = new Stack();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int result = (int)stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }

    public int top() {
        // write your code here
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int result = (int)stack2.peek();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }
}