package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
       /* Keyboard entry of two numbers to represent a range.
        Count the numbers in this range.
        How many numbers are divisible by both 3 and 5? */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to indicate the beginning of the range:");
        int start = sc.nextInt();
        System.out.println("Please enter a number to indicate the end of the range:");
        int end = sc.nextInt();

        // Count the number of numbers that meet the requirements
        int count = 0;

        // Use a loop to get each number in this range
        // Start condition: start
        // End condition: end
        for (int i = start; i <= end; i++) {
            // Judge each number and count how many satisfy the requirement
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
