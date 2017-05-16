/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/root-of-equation
@Language: Java
@Datetime: 17-05-09 17:13
*/

public class Solution {
    /**
     * @param a, b, c: parameters of the equation
     * @return a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        // Write your code here
        double test = b*b - 4 * a * c;
        if (test == 0) {
            double root = -b/(2*a);
            double[] result = {root};
            return result;
        } else if (test > 0) {
            double root1 = (-b - Math.sqrt(test))/(2*a);
            double root2 = (-b + Math.sqrt(test))/(2*a);
            double[] result = {root1, root2};
            Arrays.sort(result);
            return result;
        }
        double[] returnResult = {};
        return returnResult;
    }
}