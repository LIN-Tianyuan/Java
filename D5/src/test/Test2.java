package test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/19
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // Define a method to find the area of a circle and print the result in the method.

        getArea(1.5);
    }


    // 1. What am I going to do? Find the area of a circle
    // 2. What do I need to do this to get it done? The square of the radius
    public static void getArea(double radius){
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}
