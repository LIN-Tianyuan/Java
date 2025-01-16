package com.lin.test2;

import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        // Random number range: 1~100

        // Create object
        Random r = new Random();
        // Generate Random Numbers
        int number = r.nextInt(100) + 1;    // 1  ~ 100
        System.out.println(number);


        //  Used to generate random numbers between any number and any number 7 ~15
        //  1. Let the head and tail of this range subtract a value, so that the range starts at 0 -7 0 ~ 8
        //  2. Tail +1 8 + 1 = 9
        //  3. The final result, plus the value subtracted in the first step.

       /* Random r = new Random();
        int number = r.nextInt(9) + 7;  // 7 ~ 15
                //   0 ~ 8  + 7
        System.out.println(number); */

    }
}
