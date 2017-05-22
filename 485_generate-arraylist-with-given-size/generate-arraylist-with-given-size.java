/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/generate-arraylist-with-given-size
@Language: Java
@Datetime: 17-05-22 00:53
*/

public class Solution {
    /**
     * @param size an integer
     * @return an array list
     */
    public ArrayList<Integer> generate(int size) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int n = 1; n <= size; n++) {
            result.add(n);
        }
        return result;
    }
}