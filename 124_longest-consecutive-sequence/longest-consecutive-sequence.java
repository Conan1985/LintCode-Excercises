/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/longest-consecutive-sequence
@Language: Java
@Datetime: 17-06-10 13:13
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return an integer
     */
    public int longestConsecutive(int[] nums) {
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            int down = nums[i] - 1;
            while (set.contains(down)) {
                set.remove(down);
                down--;
            }
            int up = nums[i] + 1;
            while (set.contains(up)) {
                set.remove(up);
                up++;
            }
            longest = Math.max(longest, up - down - 1);
        }
        return longest;
    }
}