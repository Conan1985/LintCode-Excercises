/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/max-of-array
@Language: Java
@Datetime: 17-05-08 18:43
*/

public class Solution {
    /**
     * @param A a float array
     * @return a float number
     */
    public float maxOfArray(float[] A) {
        // Write your code here
        float result = A[0];
        for (int i = 1; i < A.length; i++) {
            if (result < A[i]) {
                result = A[i];
            }
        }
        return result;
    }
}