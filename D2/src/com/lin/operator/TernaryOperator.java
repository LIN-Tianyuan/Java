package com.lin.operator;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class TernaryOperator {
    public static void main(String[] args) {
        // Use the ternary operator to get the greater of two numbers

        int number1 = 10;
        int number2 = 20;

        // Get the greater of two integers using the ternary operator
        // Format: Relational expression ? Expression1 : Expression2.
        //The result of the entire ternary operator must be used

        int max = number1 > number2 ? number1 : number2;
        System.out.println(max);

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
