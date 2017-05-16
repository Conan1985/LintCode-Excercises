/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/palindrome-number
@Language: Java
@Datetime: 17-05-09 14:55
*/

public class Solution {
    /**
     * @param num a positive number
     * @return true if it's a palindrome or false
     */
    public boolean palindromeNumber(int num) {
        // Write your code here
        String str = Integer.toString(num);
        int i = 0;
        int j = str.length()-1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}