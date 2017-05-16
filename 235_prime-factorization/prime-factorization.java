/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/prime-factorization
@Language: Java
@Datetime: 17-05-14 11:43
*/

public class Solution {
    /**
     * @param num an integer
     * @return an integer array
     */
    public List<Integer> primeFactorization(int num) {
        List<Integer> result = new ArrayList<Integer> ();
        for (int i = 2; i * i <= num; i++) {
            while ( num % i == 0) {
                num = num / i;
                result.add(i);
            }
        }
        if (num != 1) {
            result.add(num);
        }
        return result;
    }
}