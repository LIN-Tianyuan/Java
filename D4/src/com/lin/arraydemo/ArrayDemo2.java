package com.lin.arraydemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // Use the index to access the elements in the array
        // 1. Get the elements inside the array
        // Format: array name [index]

        int[] arr = {1,2,3,4,5};
        // Get the first element of the array
        // It's actually the element at index 0.
        // int number = arr[0]; // System.out.println(number); // 1
        // System.out.println(number); // 1
        // Get the data at index 1 in the array and print it out directly.
        // System.out.println(arr[1]); // 2


        // 2. Store data in an array.
        // Format: array name[index] = specific data/variable;
        // Details: once overwritten, the original data no longer exists.
        arr[0] = 100;

        System.out.println(arr[0]); // 100
    }
}
