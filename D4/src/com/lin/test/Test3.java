package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
       /* Define an array that stores 1,2,3,4,5,6,7,8,9,10
        Iterate through the array to get each element.
        Requirements:
        1, if it is an odd number, then triple the current number
        2, if it is an even number, then make the current number one half */


        // Analyze:
        // 1. Define an array of 1,2,3,4,5,6,7,8,9,10.
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // 2. Iterate through the array to get each element
        for (int i = 0; i < arr.length; i++) {
            // i represents each index of the array in turn
            // arr[i] represents each element of the array in turn.
            // 3. Judge each element.
            if(arr[i] % 2 == 0){
                // An even number becomes one-half.
                arr[i] = arr[i] / 2;
            }else{
                // Odd numbers. Twice as big.
                arr[i] = arr[i] * 2;
            }
        }

        // Iterate through the array.
        // A loop tries to do only one thing.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
