package com.lin.test;

import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
     /*   Requirement:
            Define method to implement random generation of a 5-digit CAPTCHA code
            CAPTCHA format:
                Length 5
                The first four digits are uppercase or lowercase letters
                The last digit is a number
     */

        // Method:
        // In the future, if we want to randomly select from a bunch of data with no pattern
        // can first put these data into an array
        // and then randomly select an index

        // Analysis:
        // 1. Both uppercase and lowercase letters are placed in the array
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII code table
            if(i <= 25){
                // Add lowercase letters
                chs[i] = (char)(97 + i);
            }else{//27
                // Add capital letters
                // A --- 65
                chs[i] = (char)(65 + i - 26);
            }
        }

        // Define a variable of string type to record the final result
        String result = "";

        // 2. Randomize 4 times
        // Randomize the index in the array
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            // Use a random index, get the corresponding element
            //System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
        // System.out.println(result);
        // 3. Randomly select a number 0~9
        int number = r.nextInt(10);
        // Generate the final result
        result = result + number;

        // Print the final result
        System.out.println(result);

    }
}
