package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        /* Define an array, exchange the values out of the 0 index and the maximum index in the array */

        // 1. Define an array
        int[] arr = {1,2,3,4,5};
        // 2. The array of 0 index and the largest index out of the value of the exchange
        // It is also possible to exchange third party variables using
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        // 3. Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
