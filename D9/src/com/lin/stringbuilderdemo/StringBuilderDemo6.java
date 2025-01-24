package com.lin.stringbuilderdemo;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringBuilderDemo6 {
    // Scenarios for using StringBuilder:
    // 1. String splicing
    // 2. Inversion of strings

    public static void main(String[] args) {
        // 1. Keyboard entry of a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.next();

        // 2. Reverse keyboard-entered strings
        String result = new StringBuilder().append(str).reverse().toString();

        // 3. Compare
        if(str.equals(result)){
            System.out.println("The current string is a symmetric string.");
        }else{
            System.out.println("The current string is not a symmetric string.");
        }

    }
}
