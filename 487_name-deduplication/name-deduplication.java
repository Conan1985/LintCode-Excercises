/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/name-deduplication
@Language: Java
@Datetime: 17-06-06 15:41
*/

public class Solution {
    /**
     * @param names a string array
     * @return a string array
     */
    public List<String> nameDeduplication(String[] names) {
        // Write your code here
        List<String> result = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
            String str = names[i].toLowerCase();
            if (!hs.contains(str)) {
                hs.add(str);
                result.add(str);
            }
        }
        return result;
    }
}