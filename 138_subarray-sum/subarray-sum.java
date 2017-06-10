/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/subarray-sum
@Language: Java
@Datetime: 17-06-10 12:31
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i ++) {
            sum = 0;
            sum += nums[i];
            if (sum == 0) {
                result.add(i);
                result.add(i);
                return result;
            }
            for (int j = i + 1; j < nums.length; j ++) {
                sum += nums[j];
                if (sum == 0){
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return result;
    }
}