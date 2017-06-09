/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/two-sum
@Language: Java
@Datetime: 17-06-09 21:23
*/

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) != null) {
                int[] result = {map.get(numbers[i]) + 1, i + 1};
                return result;
            }
            map.put(target-numbers[i], i);
        }
        int[] result = {};
        return result;
    }
}