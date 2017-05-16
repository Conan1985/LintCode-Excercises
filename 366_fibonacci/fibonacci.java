/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/fibonacci
@Language: Java
@Datetime: 17-05-09 17:21
*/

class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int[] fibSeries = new int[n];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        } else {
            fibSeries[0] = 0;
            fibSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            }
        }
        return fibSeries[n - 1];
    }
}

