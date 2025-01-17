package com.lin.test;
import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        /* Generate 10 random numbers between 1 and 100 into an array.
        1) Find the sum of all the data
        2) Find the average of all the data
        3) Count how many data are smaller than the average value */

        // 1. Define arrays
        int[] arr = new int[10];
        // 2. Put random numbers into an array.
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            // Each loop generates a new random number
            int number = r.nextInt(100) + 1;
            // Add the generated random numbers to the array.
            // array name[index] = data;
            arr[i] = number;
        }


        // Find the sum of all the data
        // Define Summation Variables
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Loop through each element
            // and adds the elements to sum
            sum = sum + arr[i];
        }
        System.out.println("The sum of all the data in the array is: " + sum);


        // Find the average of all data
        int avg = sum / arr.length;
        System.out.println("The average in the array is: " + avg);


        // How many statistics are smaller than the mean
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }

        // When the loop has finished, it means that I have found all the data that is smaller than the mean
        System.out.println("In the array, there are a total of " + count + " pieces of data that are smaller than the mean.");


        // Iterate through the array and verify the answer
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
