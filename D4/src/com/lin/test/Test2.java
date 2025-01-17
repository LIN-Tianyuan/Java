package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        /* Define an array that stores 1,2,3,4,5,6,7,8,9,10.
        Iterate through the array to get each element and count how many numbers divisible by 3 are in the array. */


        // Analyze:
        // 1. Define an array Store 1,2,3,4,5,6,7,8,9,10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Define a variable to count the number of times
        int count = 0;
        // 2. Iterate through the array to get each element
        for (int i = 0; i < arr.length; i++) {
            // i represents each index in the array
            // arr[i] represents each element of the array.
            // 3. Determine whether the current element is a multiple of 3. If it is then the statistics variable needs to increment itself once.
            if(arr[i] % 3 == 0){
                // System.out.println(arr[i]);
                count++;
            }
        }
        // When the loop ends, it means that all the numbers in the array have been judged, and you can print the count directly.
        System.out.println("There are " + count + " numbers in the array that are divisible by 3.");

    }
}
