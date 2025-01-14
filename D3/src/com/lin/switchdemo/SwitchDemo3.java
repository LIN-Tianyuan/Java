package com.lin.switchdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        // 1 2 3  One two three
        /*int number = 1;
        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("There is no such option.");
                break;
        }*/
        /**
         * Switch New Features
         * JDK12
         */
        int number = 10;
        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("There is no such option.");
        }
    }
}
