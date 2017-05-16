/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/swap-two-integers-in-array
@Language: Java
@Datetime: 17-05-13 00:17
*/

public class Solution {
    /**
     * @param A an integer array
     * @param index1 the first index
     * @param index2 the second index
     * @return void
     */
    public void swapIntegers(int[] A, int index1, int index2) {
        // Write your code here
        int temp;
        temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}