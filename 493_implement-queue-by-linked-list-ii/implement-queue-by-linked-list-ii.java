/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/implement-queue-by-linked-list-ii
@Language: Java
@Datetime: 17-05-23 11:23
*/

public class Dequeue {
    private LinkedList ls;
    
    public Dequeue() {
        // do initialize if necessary
        ls = new LinkedList();
    }

    public void push_front(int item) {
        // Write your code here
        ls.addFirst(item);
    }

    public void push_back(int item) {
        // Write your code here
        ls.addLast(item);
    }

    public int pop_front() {
        // Write your code here
        int result = (int)ls.getFirst();
        ls.removeFirst();
        return result;
    }

    public int pop_back() {
        // Write your code here
        int result = (int)ls.getLast();
        ls.removeLast();
        return result;
    }
}