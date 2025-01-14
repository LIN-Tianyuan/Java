package com.lin.switchdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        /**
         * 1. Position: default is not necessarily written at the bottom, we can write in any position. We can write it anywhere. It's just customary to write it at the bottom.
         * 2. Omission : default can be omitted, the syntax will not be a problem, but it is not recommended to omit.
         */
        int number = 100;
        switch (number){
            case 1:
                System.out.println("The value of number is 1.");
                break;
            case 10:
                System.out.println("The value of number is 10.");
                break;
            case 20:
                System.out.println("The value of number is 20.");
                break;
            default:
                System.out.println("The value of number is not 1, 10 or 20.");
                break;
        }
    }
}
