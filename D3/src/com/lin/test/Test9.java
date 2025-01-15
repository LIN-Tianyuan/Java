package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test9 {
    public static void main(String[] args) {
        /* Given two integers, dividend and divisor (both positive and not exceeding the range of int) .
        Divide the two numbers without using multiplication, division and % operators.
        Get the quotient and remainder.

        Analysis:
            Dividend / divisor = quotient ... Remainder

        int a = 100;
        int b = 10;

        100 - 10 = 90
        90 - 10 = 80
        80 - 10 = 70
        70 - 10 = 60
        ...
        10 - 10 = 0 (Remainder)

        */


        // 1.Define variables to record dividend
        int dividend = 100;
        // 2.Define variables to record divisor
        int divisor = 37;
        // 3.Define a variable to count how many times the sum is subtracted.
        int count = 0;
        // 4. Loop while
        // In the loop, keep using the divisor - divisor
        // As long as the dividend is greater than or equal to the divisor, the loop continues.
        while(dividend >= divisor){
            dividend = dividend - divisor;
            // As soon as it is subtracted once, then the statistical variable is incremented once
            count++;
        }
        // When the loop ends, the dividend variable records the remainder.
        System.out.println("The remainder is:" + dividend);
        // When the loop is finished, the value recorded in the count record is the quotient.
        System.out.println("The quotient is:" + count);
    }
}
