/*
@Copyright:LintCode
@Author:   Conan_1985
@Problem:  http://www.lintcode.com/problem/rectangle-area
@Language: Java
@Datetime: 17-05-10 21:51
*/

public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    public int height;
    public int width;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    public int getArea () {
        return height*width;
    }
}
