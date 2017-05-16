/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/amicable-pair
@Language: Java
@Datetime: 17-05-14 14:11
*/

public class Solution {
    /**
     * @param k an integer
     * @return all amicable pairs
     */
    public List<List<Integer>> amicablePair(int k) {
        // Write your code here
        List<List<Integer>> amicablePairs= new ArrayList<List<Integer>>();
        for (int i = 1; i <= k; i++) {
            int amicableI = sumDivisors(i);
            if (amicableI <= i || amicableI > k) {
                continue;
            }
            if (i == sumDivisors(amicableI)) {
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(i);
                pair.add(amicableI);
                amicablePairs.add(pair);
            }
        }
        return amicablePairs;
        
    }
    
    public int sumDivisors(int m) {
        int sum = 1, n;
        for (n = 2; n * n < m; n++) {
            if (m % n == 0) {
                sum += n + m/n;
            }
        }
        if (n*n == m) {
            sum += n;
        }
        return sum;
    }
}