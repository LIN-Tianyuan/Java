package com.lin.ifdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class IfDemo {
    public static void main(String[] args) {
        /**
         *  Points to note about if:
         *         1. The beginning of curly braces can be written on a separate line, but it is recommended that they be written at the end of the first line.
         *         2. In the body of the statement, if there is only one line of code, curly braces can be omitted. Personally, Do not omit the curly braces.
         *         3. If you are judging a Boolean variable, do not use the == sign, and write the variable directly in parentheses.
         */
          /* int number = 20;
           if(number >= 10)
           // int a = 100;
           // System.out.println("Number greater than or equal to 10");
           */

        boolean flag = true;
        if(flag){
            System.out.println("The value of flag is true.");
        }


    }
}
