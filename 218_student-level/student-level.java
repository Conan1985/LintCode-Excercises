/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/student-level
@Language: Java
@Datetime: 17-05-13 22:40
*/

public class Student {
    /**
     * Declare two public attributes name(string) and score(int).
     */
    // write your code here
    public String name;
    public int score;
    
    /**
     * Declare a constructor expect a name as a parameter.
     */
    // write your code here
    public Student(String name) {
        this.name = name;
    }
    
    /**
     * Declare a public method `getLevel` to get the level(char) of this student.
     */
    // write your code here
    public char getLevel() {
        char level;
        if (score >= 90) {
            level = 'A';
        } else if (score >= 80) {
            level = 'B';
        } else if (score >= 60) {
            level = 'C';
        } else if (score < 60) {
            level = 'D';
        } else {
            level = 'N';
        }
        return level;
    }
}