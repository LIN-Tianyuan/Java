package com.lin.test;
import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) {
       /* Demand:
        A v-live raffle with cash prizes in the form of five prizes {2, 588 , 888, 1000, 10000}.
        Please use the code to simulate the lottery and print out each prize, the order in which the prizes appear should be randomized and not repeated.
        The printout will look like this (in randomized order, not necessarily in the following order)
            The prize of $888 is drawn
            The prize of $588 is drawn
            The $10,000 prize is drawn
            The $1000 prize is drawn
            The $2 prize is drawn
        */

        // 1. Reverse the order of all prizes in the prize pool
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            // Get random index
            int randomIndex = r.nextInt(arr.length);
            // Take i and swap it with the value at randomIndex.
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // 2. Iterate through the prize pool, starting from index 0 to get each prize
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
