package com.lin.switchdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        /**
         * case penetration
         *   is caused by not writing break in the body of the statement.
         * The execution process:
         *   First of all, it will still take the value of the expression in the parentheses and match it with each of the following cases.
         *   If it matches, it will execute the corresponding statement body, and if it finds a break, then it will end the whole switch statement.
         *   If no break is found, then the program will continue to execute the statement body of the next case, until it encounters a break or a right curly brace.
         * Usage Scenario:
         *   If the statement bodies of multiple cases are duplicated, then we consider using case penetration to simplify the code.
         */
        int number = 100;
        switch (number){
            case 1:
                System.out.println("The value of number is 1.");
                break;
            case 10:
                System.out.println("The value of number is 10.");
                // break;
            case 20:
                System.out.println("The value of number is 20.");
                break;
            default:
                System.out.println("The value of number is not 1, 10 or 20.");
                // break;
        }
    }
}
