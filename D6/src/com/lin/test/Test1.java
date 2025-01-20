package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
       /* Airfares are charged according to low season and high season, first class and economy class, enter the original price of the ticket, the month and the first or economy class.
        Airfares are calculated according to the following rules: high season (May-October) 10% off for first class and 15% off for economy class, low season (November through April) 30% off for first class and 65% off for economy class. */

        // Analysis:
        // 1. Keyboard entry of the original price of the ticket, month, first class or economy class
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the original price of the ticket: ");
        int ticket = sc.nextInt();
        System.out.println("Please enter the current month: ");
        int month = sc.nextInt();
        System.out.println("Please enter the currently purchased class (0 First Class 1 Economy Class): ");
        int seat = sc.nextInt();
        // 2. First determine whether the month is high season or low season
        // ctrl + alt + M auto extract method
        if (month >= 5 && month <= 10) {
            // high season // 3. Continue to determine whether the current ticket is economy or first class
            // ticket = getPrice(ticket, seat, 0.9, 0.85);
            ticket = getTicket(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // low season
            // ticket = getPrice(ticket, seat, 0.7, 0.65);
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        } else {
            // Indicates that the month entered at the keypad is an illegal data.
            System.out.println("Months entered on the keyboard are not legal.");
        }

        System.out.println(ticket);
    }

    public static int getTicket(int ticket, int seat, double v, double v2) {
        if (seat == 0) {
            // first class
            ticket = (int) (ticket * v);
        } else if (seat == 1) {
            // economy class
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("There's no such cabin.");
        }
        return ticket;
    }
}
