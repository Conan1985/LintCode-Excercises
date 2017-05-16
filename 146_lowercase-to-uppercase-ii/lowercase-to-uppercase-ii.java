/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/lowercase-to-uppercase-ii
@Language: Java
@Datetime: 17-05-13 23:20
*/

public class Solution {
    /**
     * @param str a string
     * @return a string
     */
    public String lowercaseToUppercase2(String str) {
        // Write your code here
        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) >= 'a' && result.charAt(i) <= 'z') {
                result.setCharAt(i, (char)(result.charAt(i) + 'A' - 'a'));
            }
        }
        String output = result.toString();
        return output;
    }
}