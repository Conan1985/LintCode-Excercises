/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/reverse-3-digit-integer
@Language: Java
@Datetime: 17-05-01 18:40
*/

class Solution {
    /*
     * param number: A 3-digit number.
     * return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int digitH = number / 100;
        int remainH = number % 100;
        int digitT = remainH / 10;
        int remainT = remainH % 10;
        int digitO = remainT;
        int reverseNumber = digitH + digitT * 10 + digitO * 100;
        return reverseNumber;
    }
};
