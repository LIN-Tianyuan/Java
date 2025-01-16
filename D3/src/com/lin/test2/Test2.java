package com.lin.test2;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /* Keyboard an integer x greater than or equal to 2, calculate and return the square root of x.
        Only integer parts of the result will be retained; fractional parts will be rounded off. 。*/


        // Analyze:
        // Square root of 16 -> 4
        // Square root of 4  -> 2


        // 10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        // Corollary: the square root of 10 is between 3 and 4.


        // 20
        // 1 * 1 = 1 < 20
        // 2 * 2 = 4 < 20
        // 3 * 3 = 9 < 20
        // 4 * 4 = 16 < 20
        // 5 * 5 = 25 > 20
        // Corollary: the square root of 20 is between 4 and 5.


        // In the code
        // Loop from 1, take the square of the number and compare it with the original number
        // If it is less than, then continue to judge backwards
        // If equal, then the current number is the square root.
        // If it is greater than, then the previous number is the integer part of the square with


        //1. Keyboard an integer
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int number = sc.nextInt();
        // 2. Cyclic judgment from 1
        // Start: 1 End: number
        for (int i = 1; i <= number; i++) {
            // Compare i * i to number.
            if(i * i == number){
                System.out.println(i + " is the square root of " + number + ".");
                // Once it's found, the loop can be stopped and the numbers that follow don't need to be found anymore, improving the efficiency of the code's operation.
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + " is the integer part of the square root of " + number + ".");
                break;
            }
        }

        //  Optimisation
        /* for (int i = 2; i <= square root of number; i++) {
            ...
        }*/
    }
}
