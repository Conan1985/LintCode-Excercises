/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/reverse-integer
@Language: Java
@Datetime: 17-05-09 19:22
*/

public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        int reverse = 0;
        while (n != 0) {
            int temp = reverse * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != reverse) {
                reverse = 0;
                break;
            }
            reverse = temp;
        }
        return reverse;
    }
}