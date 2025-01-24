package com.lin.stringdemo;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo3 {
    public static void main(String[] args) {
        // 1. Let's say I'm keyboarding an abc.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str1 = sc.next();    // abc is a new one.
        // 2. Code and then define a string abc
        String str2 = "abc";
        // 3. Can the two be the same when compared with ==?
        System.out.println(str1 == str2);   // false

        // Conclusion.
        // Whenever we want to compare the contents of strings in the future, we must use the methods inside String
    }
}
