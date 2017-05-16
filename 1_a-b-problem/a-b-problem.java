/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/a-b-problem
@Language: Java
@Datetime: 17-05-02 14:10
*/

class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        while (b != 0) {
            int carry = a ^ b;
            b = (a & b) << 1;
            a = carry;
        }
        return a;
    }
};