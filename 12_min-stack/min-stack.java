/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/min-stack
@Language: Java
@Datetime: 17-05-23 15:58
*/

public class MinStack {
    Stack st;
    Stack sm;
    
    public MinStack() {
        // do initialize if necessary
        st = new Stack();
        sm = new Stack();
    }

    public void push(int number) {
        // write your code here
        if (st.empty() || (int)sm.peek() > number) {
            sm.push(number);
        } else {
            sm.push(sm.peek());
        }
        st.push(number);
    }

    public int pop() {
        // write your code here
        sm.pop();
        return (int)st.pop();
    }

    public int min() {
        // write your code here
        return (int)sm.peek();
    }
}
