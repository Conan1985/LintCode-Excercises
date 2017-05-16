/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/second-max-of-array
@Language: Java
@Datetime: 17-05-03 14:38
*/

public class Solution {
    /**
     * @param nums: An integer array.
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        /* your code */
        int[] carry = new int[2];
        if (nums[0] < nums[1]) {
            carry[0] = nums[0];
            carry[1] = nums[1];
        } else {
            carry[0] = nums[1];
            carry[1] = nums[0];
        }
        if (nums.length > 2) {
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] > carry[1]) {
                    carry[0] = carry[1];
                    carry[1] = nums[i];
                } else if (nums[i] > carry[0]) {
                    carry[0] = nums[i];
                }
            }
        }
        return carry[0];
    }
}