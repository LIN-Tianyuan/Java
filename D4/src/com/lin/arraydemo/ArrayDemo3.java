package com.lin.arraydemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 1. Define array
        int[] arr = {1,2,3,4,5};
        // 2. Get all the elements in the array

       /* for (int i = 0; i < 5; i++) {
            //i: 0 1 2 3 4
            System.out.println(arr[i]);
        }*/

        // In Java, a length attribute on the array, length
        // call mode: array.length
        // System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            //i: 0 1 2 3 4
            System.out.println(arr[i]);
        }

        // Extension:
        // Automated fast way to generate traversals of arrays
        // provided by Idea
        // array name.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
