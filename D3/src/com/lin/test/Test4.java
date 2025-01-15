package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
       /* When playing the game, if the network is not good then it will often disconnect and reconnect.
        Then the business logic of disconnecting and reconnecting needs to be repeated.
        Assuming that the company now requires that the business logic of disconnecting and reconnecting be written only 5 times at most. */

        for(int i = 1; i <= 5;i++){
            System.out.println(i + "th implementation of the disconnected reconnection service");
        }
    }
}
