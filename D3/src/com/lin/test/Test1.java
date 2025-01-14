package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        /* In real development, movie theater seat selection will also use if judgment.
        Suppose a theater sells 100 tickets with serial numbers 1~100.
        The odd-numbered tickets are on the left side and the even-numbered tickets are on the right side.
        The keyboard enters an integer representing the ticket number of the movie ticket.
        Depending on the situation, different prompts are given:
        If the ticket number is odd, then print to the left.
        If the ticket number is even, then print to the right. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a ticket number:");
        int ticket = sc.nextInt();
        // A ticket is only valid if it is between 0 and 100.
        // Nesting of if
        if (ticket >= 0 && ticket <= 100) {
            // Determine whether a ticket number is odd or even
            if (ticket % 2 == 1) {
                System.out.println("Left");
            } else {
                System.out.println("Right");
            }
        }
    }
}
