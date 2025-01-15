package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        /*  Find the sum between 1 and 100 */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // Expand smaller:
            // 1. The variable for summation cannot be defined inside the loop because the variable is only valid in the curly brackets it belongs to
            // 2. If we define the variable inside the loop, then the current variable is only valid for this loop.
            // When the current loop ends, the variable disappears from memory.
            // A new variable is defined again when the second loop starts.
            // Conclusion: If we want to write variables for accumulating and summing in the future. We can define the variable outside the loop.
            // Can add each number you get to the variable sum.
            sum = sum + i;  // sum += i;
        }

        System.out.println(sum);


    }
}
