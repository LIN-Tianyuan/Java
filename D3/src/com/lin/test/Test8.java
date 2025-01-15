package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        /* You are given an integer x.
        If x is a palindrome, print true, otherwise, return false.
        Explanation: A palindrome is an integer that reads the same in both positive (left-to-right) and negative (right-to-left) order.
        For example, 121 is a palindrome, while 123 is not. */

        // 1.Define variables to record integer
        int x = 12345;
        // Make a temporary store of x to be used for final judgments
        int temp = x;
        // 2.Define variables to record the final result (reversed numbers)
        int result = 0;
        // 3.Use a loop to get the number in x from right to left and splice it into result.
        while(x != 0){
            // Get the rightmost digit of x
            int num = x % 10;
            // After getting the number once, then the current rightmost number should be removed.
            x = x / 10;
            // Splice into result
            result = result * 10 + num;
        }
        System.out.println(result == temp);
    }
}
