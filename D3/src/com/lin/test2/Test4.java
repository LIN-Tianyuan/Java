package com.lin.test2;

import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // Get a random number first.
        // Range: 0~10

        // Create Object
        Random r = new Random();

        // Generate random numbers
        // Judgemental techniques:
        // In parentheses, the range of generated random numbers is written
        // This range must start from 0.
        // To the end of this number -1
        // Mnemonic: wrap the head not the tail, wrap the left not the right
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10);// 0 ~ 9
            System.out.println(number);
        }
    }
}
