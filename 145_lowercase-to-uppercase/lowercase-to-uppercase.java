/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/lowercase-to-uppercase
@Language: Java
@Datetime: 17-05-09 01:05
*/

public class Solution {
    /**
     * @param character a character
     * @return a character
     */
    public char lowercaseToUppercase(char character) {
        // Write your code here
        char result;
        result = (char) (character - 'a' + 'A');
        return result;
    }
}