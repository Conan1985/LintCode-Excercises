/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/simple-calculator
@Language: Java
@Datetime: 17-05-08 18:03
*/

public class Calculator {
    /**
      * @param a, b: Two integers.
      * @param operator: A character, +, -, *, /.
      */
    int result;
    public int calculate(int a, char operator, int b) {
        /* your code */
        switch((int) operator) {
            case 43:
                result = a + b;
                break;
            case 45:
                result = a - b;
                break;
            case 42:
                result = a * b;
                break;
            case 47:
                result = a / b;
                break;
            default:
                break;
        }
        return result;
    }
}