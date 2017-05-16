/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/remove-duplicate-numbers-in-array
@Language: Java
@Datetime: 17-05-09 11:38
*/

public class Solution {
    /**
     * @param nums an array of integers
     * @return the number of unique integers
     */
    public int deduplication(int[] nums) {
        // Write your code here
        HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], true);
        }
        int result = 0;
        for (Map.Entry<Integer, Boolean> entry : mp.entrySet()) {
            nums[result++] = entry.getKey();
        }
        return result;
    }
}