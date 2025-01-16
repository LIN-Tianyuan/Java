package com.lin.test2;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        // Enter a positive integer x at the keyboard and determine if the integer is a prime number.

        // Prime numbers:
        // If an integer is divisible only by 1 and itself, then the number is prime. Otherwise the number is called a composite number
        // 7 = 1 * 7 prime number
        // 8 = 1 * 8 2 * 4 composite number


        // Analysis:
        // 1. Keyboard entry of a positive integer
        // number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int number = sc.nextInt();  // 9

        // Define a variable that represents the marker
        // marks if the number is a prime or not
        // true: is a prime number
        // false : not a prime number

        // Indicate that number is initially recognized as a prime number.
        boolean flag = true;


        //2. Judgment
        // Write a loop to start judging from 2 and keep judging until number-1
        // Look at the range, there is no number that can be divided by number.
        for (int i = 2; i < number; i++) {
            // i represents each number in this range in turn
            // Just see if number is divisible by i
            if(number % i == 0){ // 9 % 2 = 1
                flag = false;
                break;
            }
        }

        // Only when this loop is over, it means that all the numbers in the range have been judged.
        // This is the only way to determine that number is a prime number.
        if(flag){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }

    }
}
