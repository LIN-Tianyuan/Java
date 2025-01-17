package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/17
 * @description ：
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        /* Define two variables and exchange the values of the records of the two variables. */
        int a = 10;
        int b = 20;

        // Define a temporary third-party variable
        // Assigns the value of variable a, to temp
        int temp = a;
        // Assigns the value of variable b, to a. Then the value originally recorded for variable a is overwritten
        a = b;
        // is to take the original value of variable a and assign it to variable b
        b = temp;
        System.out.println(a);  // 20
        System.out.println(b);  // 10

    }
}
