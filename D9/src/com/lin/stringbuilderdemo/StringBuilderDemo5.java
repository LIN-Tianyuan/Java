package com.lin.stringbuilderdemo;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        // Chained programming:
        // When we are calling a method, we don't need to receive his result in a variable and can continue to call other methods
        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);


    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.next();
        return str;
    }
}
