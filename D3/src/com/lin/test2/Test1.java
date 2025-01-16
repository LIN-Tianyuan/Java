package com.lin.test2;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        /* Friends may play a game when they gather: 7 over
        Game rules: from any number to start reporting the number, when you want to report the number contains 7 or a multiple of 7 have to say over: over
        Requirements: the use of the program to print out the console between 1-100 to meet the rule of seven must be over the data */

        // Analyze：
        // 1 2 3 4 5 6 over 8 9 10 11 12 13 over 15 16 over 18 19 20 over....
        // 69 over over over over... 80

        for (int i = 1; i <= 100; i++) {
            // Judge each number and print over it if it meets the rules, or print the real number if it doesn't meet the rules
            if(i % 10 == 7 || i / 10 % 10 == 7  ||  i % 7 == 0){
                System.out.println("Over");
                continue;
            }
            System.out.println(i);
        }

    }
}
