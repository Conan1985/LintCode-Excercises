/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/valid-palindrome
@Language: Java
@Datetime: 17-05-14 00:12
*/

public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        int i = 0;
        int j = s.length() - 1;
        boolean result = true;
        if (j == 0) {
            return result;
        }
        String st = s.toLowerCase();
        while (i < j) {
            if (!((st.charAt(i) >='a' && st.charAt(i) <= 'z') ||(st.charAt(i) >= '0' && st.charAt(i) <= '9'))) {
                i++;
                continue;
            } 
            if (!((st.charAt(j) >='a' && st.charAt(j) <= 'z') ||(st.charAt(j) >= '0' && st.charAt(j) <= '9'))) {
                j--;
                continue;
            }
            if (st.charAt(i) != st.charAt(j)) {
                result = false;
                break;
            } 
            i++;
            j--;
        }
        return result;
    }
}