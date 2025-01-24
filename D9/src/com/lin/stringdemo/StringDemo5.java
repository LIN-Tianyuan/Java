package com.lin.stringdemo;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo5 {
    public static void main(String[] args) {
        // 1. Keyboard entry of a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = sc.next();
        // 2. Perform traversals
        for (int i = 0; i < str.length(); i++) {
            // i represents each index of the string in turn
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
