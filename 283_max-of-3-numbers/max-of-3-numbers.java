/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/max-of-3-numbers
@Language: Java
@Datetime: 17-05-08 18:46
*/

public class Solution {
    /**
     * @param num1 an integer
     * @param num2 an integer
     * @param num3 an integer
     * @return an integer
     */
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // Write your code here
        int result = num1;
        if (result < num2) {
            result = num2;
        } 
        if (result < num3) {
            result = num3;
        }
        return result;
    }
}