package com.lin.operator;/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class AssigningOperatorDemo {
    public static void main(String[] args) {
        // +=
        // Rule: add the left side and the right side and then assign the result to the left side
        int a = 10;
        int b = 20;
        // Take a + b and assign the result to the left variable a
        a += b;
        //  a = (int)(a + b);
        System.out.println(a);  // 30
        System.out.println(b);  // 20


        // Detail:
        //+=, -=, *=, /=, %= The bottom line hides a mandatory type conversion.
        short s = 1;
        // Add the left side and the right side to get the result 2 and assign it to the variable on the left side
        s += 1;
        // s = （short）（s + 1）;
        System.out.println(s);  // 2
    }
}
