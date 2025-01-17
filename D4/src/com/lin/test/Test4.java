package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // Define the array to find the maximum value: 33,5,22,44,55


        // If the start condition of the loop is 0, then the first loop is compared with itself, which has no effect on the result, but it is inefficient.
        // In order to improve efficiency and reduce the number of loops at a time, the loop start condition can be written as 1.


        // 1. Define the array to store the 5 values
        int[] arr = {33,5,22,44,55};
        // 2. Define a variable max to store the maximum value.
        // Temporarily considers the data at index 0 to be the largest
        int max = arr[0];
        // 3. Loop through each element of the array
        // Take each element and compare it to max.
        for (int i = 1; i < arr.length; i++) {
            // i index arr[i] element
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // 4. When the loop ends, max records the maximum value in the array.
        System.out.println(max);    // 55
    }
}
