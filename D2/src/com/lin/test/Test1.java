package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        // Keyboard a three-digit number and get the first, second, and third digits.

        // Key entry
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a three-digit number:");
        int number = sc.nextInt();

        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100 % 10;
        System.out.println("First is: " + first);
        System.out.println("Second is: " + second);
        System.out.println("Third is: " + third);
    }
}
