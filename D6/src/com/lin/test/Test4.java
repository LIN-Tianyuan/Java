package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
       /* Copy elements from one array to another new array. */

        // Analysis:
        // 1. Define an old array and store some elements
        int[] arr = {1,2,3,4,5};
        // 2. Define a new array with the same length as the old one.
        int[] newArr = new int[arr.length];
        // 3. Iterate through the old array, get the old array of each element, in turn, deposited into the new array
        for (int i = 0; i < arr.length; i++) {
            // i denotes the index in the old array. Each index in the new array
            // arr[i]  represents the elements of the old array
            newArr[i] = arr[i];
        }

        // 4. The new array is already full of elements
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
