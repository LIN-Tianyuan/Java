package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        /* Define an array with 1,2,3,4,5. Exchange the elements corresponding to the first and last indexes.
            Before: 1,2,3,4,5
            After: 5,2,3,4,1 */


        // 1. Define an array to store data
        int[] arr = {1,2,3,4,5};
        // 2. Use loops to exchange data
        for(int i = 0,j = arr.length - 1; i < j; i++,j--){
            // Swap the elements pointed to by variable i and variable j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // When the loop is finished, then the data in the array is swapped head to tail
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
