package com.lin.test;
import java.util.Scanner;
/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /* The number 6 is a really great number for keyboard entry of two integers.
        If one of them is 6, the final result outputs true.
        If their sum is a multiple of 6. The final result is true.
        In all other cases it is false. */


        // a == 6 || b == 6 || (a + b) % 6 == 0

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int number1 = sc.nextInt();
        System.out.println("Please enter a second integer:");
        int number2 = sc.nextInt();

        // Can short-circuit the logical operators to connect the three judgments.
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;

        System.out.println(result);
    }
}
