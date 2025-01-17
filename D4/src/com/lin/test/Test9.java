package com.lin.test;
import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test9 {
    public static void main(String[] args) {
        // Define an array and deposit 1 to 5. Require to disrupt the order of all data in the array.。
        // How to get a random index in an array
       /* int[] arr = {1,2,3,4,5};
        // Index Scope：0 1 2 3 4
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        System.out.println(randomIndex);*/


        // 1. Define an array to store 1~5
        int[] arr = {1, 2, 3, 4, 5};
        // 2. Loop through the array, starting at index 0 to disrupt the order of the data
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            // Generate a random index
            int randomIndex = r.nextInt(arr.length);
            // Take the element pointed to by the random index and swap it with the element pointed to by i.
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // When the loop is over, then all the data in the array has been out of order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
