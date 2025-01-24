package com.lin.stringdemo;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo6 {
    public static void main(String[] args) {
        // 1. Keyboard entry of a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = sc.next();
        // 2. Statistics - the idea of counters
        // Define three counters
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            // i represents each index in the string in turn
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                // A variable of type char is automatically type-elevated to int when it is involved in a calculation Query ascii code table
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }

        // 3. Output Printing
        System.out.println("There are " + smallCount + " lowercase letters.");
        System.out.println("There are " + bigCount + " uppercase letters.");
        System.out.println("There are " + numberCount + " numbers.");
    }
}
