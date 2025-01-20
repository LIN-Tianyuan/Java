package com.lin.test;
import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test9 {
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


        // Analysis:
        // 1. Define an array to represent the prize pool
        int[] arr = {2, 588, 888, 1000, 10000};
        // 2. Define a new array to store the results of the lottery.
        int[] newArr = new int[arr.length];
        // 3. Lucky Draw
        Random r = new Random();
        // Since there are 5 prizes, here's the loop 5 times
        for (int i = 0; i < 5; ) {
            // Get random index
            int randomIndex = r.nextInt(arr.length);
            // Get Awards
            int prize = arr[randomIndex];
            // Determine if the current award exists, if it does then redraw it, if it doesn't then it is a valid award
            boolean flag = contains(newArr, prize);
            if(!flag){
                // Add the current prize to newArr.
                newArr[i] = prize;
                // Once added, move the index
                i++;
            }
        }
        // 4. Iterate over newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }

    // Determine whether prize exists in the array.
    // Exist: true
    // Does not exist: false
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }

}
