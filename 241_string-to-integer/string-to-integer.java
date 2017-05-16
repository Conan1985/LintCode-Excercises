/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/string-to-integer
@Language: Java
@Datetime: 17-05-13 23:07
*/

public class Solution {
    /**
     * @param str a string
     * @return an integer
     */
    public int stringToInteger(String str) {
        // Write your code here
        int result = 0;
        if (str.charAt(0) == '-') {
            for (int i = 1; i < str.length(); i++) {
                result = result * 10 + str.charAt(i) - '0';
            }
            result = - result;
        } else {
            for (int i = 0; i < str.length(); i++) {
                result = result * 10 + str.charAt(i) - '0';
            }
        }
        return result;
    }
}