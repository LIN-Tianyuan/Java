package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
         /* Keyboard enters the number of days of the week and outputs the weekdays and days off.
        (1-5) working days, (6-7) days off. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer for the day of the week:");
        int week = sc.nextInt();
        // Utilize switch statements to make selections
        switch (week){
            case 1,2,3,4,5 ->  System.out.println("Work day");
            case 6,7 ->  System.out.println("Rest day");
            default -> System.out.println("No this week");
        }


    }
}
