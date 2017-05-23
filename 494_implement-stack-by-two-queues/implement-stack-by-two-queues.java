/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/implement-stack-by-two-queues
@Language: Java
@Datetime: 17-05-23 01:09
*/

class Stack {
    // Push a new item into the stack
    
    LinkedList queue1 = new LinkedList();
    LinkedList queue2 = new LinkedList();
    
    public void push(int x) {
        // Write your code here
        queue1.add(x);
    }

    // Pop the top of the stack
    public void pop() {
        // Write your code here
        while (queue1.size()>1) {
            queue2.add(queue1.getFirst());
            queue1.removeFirst();
        }
        queue1.removeFirst();
        while (queue2.size()>0) {
            queue1.add(queue2.getFirst());
            queue2.removeFirst();
        }
    }

    // Return the top of the stack
    public int top() {
        // Write your code here
        while (queue1.size()>1) {
            queue2.add(queue1.getFirst());
            queue1.removeFirst();
        }
        int result = (int) queue1.getFirst();
        queue1.removeFirst();
        queue2.add(result);
        while (queue2.size()>0) {
            queue1.add(queue2.getFirst());
            queue2.removeFirst();
        }
        return result;
    }

    // Check the stack is empty or not.
    public boolean isEmpty() {
        // Write your code here
        if (queue1.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}