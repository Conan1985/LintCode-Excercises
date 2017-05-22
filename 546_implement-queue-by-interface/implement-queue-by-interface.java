/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/implement-queue-by-interface
@Language: Java
@Datetime: 17-05-22 11:26
*/

interface InterfaceQueue {
    void push(int val);

    // define an interface for pop method
    /* write your code here */
    int pop();

    // define an interface for top method
    /* write your code here */
    int top();
}

public class MyQueue implements InterfaceQueue {
    /* you can declare your private attributes here */
    LinkedList ls;

    public MyQueue() {
       // do initialization if necessary
       ls = new LinkedList();
    }

    // implement the push method
    /* write your code here */
    public void push(int n) {
        ls.addLast(n);
    }


    @Override
    public int pop() {
        /* write your code here */
        return (int) ls.removeFirst();
    }

    @Override
    public int top() {
        /* write your code here */
        return (int) ls.getFirst();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */