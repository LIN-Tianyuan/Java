package test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/19
 * @description ：
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        // Define methods to compare the area of two rectangles

        // Call the method to get the area of the rectangle and compare it again
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);

        if(area1 > area2){
            System.out.println("The first rectangle is bigger.");
        }else{
            System.out.println("The second rectangle is bigger.");
        }
    }


    // Define a method to find the area of a rectangle
    // 1. What am I going to do? Find the area of a rectangle
    // 2. What do I need? Length and width.
    // 3. Where the method is called, do I need to continue to use the result of the method.
    // If you want to use it, the method must have a return value.
    // If it is not to be used, the method may or may not write a return value.
    public static double getArea(double len, double width){
        double area = len * width;
        return area;
    }


/*    public static void compare(double len1, double width1, double len2, double width2){
        double area1 = len1 * width1;
        double area2 = len2 * width2;

        if(area1 > area2){
            System.out.println("The first rectangle is bigger.");
        }else{
            System.out.println("The second rectangle is bigger.");
        }
    }*/
}
