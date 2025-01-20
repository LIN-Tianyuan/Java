package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // Determine how many prime numbers there are between 101 and 200 and print all of them.

        // Define a variable to count how many primes there are
        int count = 0;
        // Outer loop: iterates through the range 101~200, and gets every number in the range in turn.
        for (int i = 101; i <= 200; i++) {
            // i denotes each number in the loop in turn
            // Continue to determine if i is a prime number
            boolean flag = true;
            // Inner loop:determine whether the current number is a prime number.
            for (int j = 2; j < i; j++) {
                // j Indicates each number between 2 and 99.
                if(i % j == 0){
                    flag = false;
                    // Break out of the single-layer cycle, the inner cycle
                    break;
                }
            }
            if(flag){
                System.out.println("“The current number " + i + " is prime.”");
                count++;
            }
        }

        System.out.println("There are " + count + " primes in total.");

    }
}
