/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Java
@Datetime: 17-05-22 19:41
*/

public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        boolean isValid = false;
        Stack check = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            if (check.empty() && (charS == ')' || charS == '}' || charS == ']')) {
                return isValid;
            } else if (check.empty() && (charS == '(' || charS == '{' || charS == '[')) {
                check.push(charS);
                continue;
            } else if (!check.empty()){
                if (charS == '(' || charS == '{' || charS == '[') {
                    check.push(charS);
                    continue;
                } else if (((char)check.peek() == '(') && (charS == ')')) {
                    check.pop();
                    continue;
                } else if (((char)check.peek() == '{') && (charS == '}')) {
                    check.pop();
                    continue;
                } else if (((char)check.peek() == '[') && (charS == ']')) {
                    check.pop();
                    continue;
                } else {
                    return isValid;
                }
            }
        }
        if (check.empty()) {
            isValid = true;
        } 
        return isValid;
    }
}