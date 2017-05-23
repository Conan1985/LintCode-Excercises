/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/implement-queue-by-linked-list
@Language: Java
@Datetime: 17-05-23 11:25
*/

public class MyQueue {
    private LinkedList ls;
    
    public MyQueue() {
        // do initialize if necessary
        ls = new LinkedList();
    }

    public void enqueue(int item) {
        // Write your code here
        ls.addLast(item);
    }

    public int dequeue() {
        // Write your code here
        int result = (int)ls.getFirst();
        ls.removeFirst();
        return result;
    }
}