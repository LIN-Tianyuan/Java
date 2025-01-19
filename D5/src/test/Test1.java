package test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/19
 * @description ：
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        // Define a method to find the perimeter of a rectangle and print the result in the method.

        getLength(5.2,1.3);

    }


    // 1. What am I going to do? Find the perimeter of a rectangle
    // 2. What do I need to do this to get it done? Length Width
    public static void getLength(double len, double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
