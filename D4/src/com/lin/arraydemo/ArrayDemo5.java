package com.lin.arraydemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        // 1. Define an array
        int[] arr = {1,2,3,4,5};
        // Length: 5
        // Minimum index: 0
        // Maximum index: 4 (length of the array - 1)
        System.out.println(arr[2]);

        // Summary:
        // Index out-of-bounds exception
        // Cause: accessed a non-existent index
        // Avoid: range of indexes
        // Minimum index: 0
        // Maximum index: (length of array - 1)
    }
}
