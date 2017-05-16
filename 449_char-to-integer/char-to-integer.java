/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/char-to-integer
@Language: Java
@Datetime: 17-05-08 18:30
*/

public class Solution {
    /**
     * @param character a character
     * @return an integer
     */
    public int charToInteger(char character) {
        // Write your code here
        int number = character - '\0';
        return number;
    }
}