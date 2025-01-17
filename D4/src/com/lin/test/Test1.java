package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        /* Define an array to store 1,2,3,4,5.
        Iterate through the array to get each element and find the sum of all the data in the array. */


        // Analyze:
        // 1. Define an array and add data 1,2,3,4,5
        int[] arr = {1,2,3,4,5};

        // summation variable
        int sum = 0;
        // 2. Iterate through the array to get each data, add up the sum
        for (int i = 0; i < arr.length; i++) {
            // i represents each index of the array in turn
            // arr[i] represents each element of the array in turn.
            sum = sum + arr[i];
        }

        // When the loop is finished, the value of sum is the result of the summation
        System.out.println(sum);
    }
}
