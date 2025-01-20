package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        // Requirement:
        // Add every bit on the integer to the array
        // Reverse the derivation

        // 1. Calculate the length of the array
        int number = 12345;
        // Define a variable to temporarily record the value of number, just to be used again in the third step.
        int temp = number;
        // Define a variable for statistics
        int count = 0;
        while(number != 0){
            // Remove a number from the right side with each loop
            number = number / 10;
            // Removing one counter increments the counter once.
            count++;
        }
        // 2. Define arrays
        // Dynamic initialization
        int[] arr = new int[count];
        // 3. Add each bit of an integer to the array.
        int index = arr.length -1;
        while(temp != 0){   // 12345
            // Get an array of each bit in temp
            int num = temp % 10;
            // Remove the number on the right
            temp = temp / 10;
            // Add the currently acquired digits to the array
            arr[index] = num;
            index--;
        }
        //Verification results  1  2  3  4 5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
