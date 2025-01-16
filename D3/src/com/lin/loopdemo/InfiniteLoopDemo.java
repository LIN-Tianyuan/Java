package com.lin.loopdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：
 * @version: 1.0
 */
public class InfiniteLoopDemo {
    public static void main(String[] args) {
        // Infinite loop in for format
        /*for(;;){
            System.out.println("Study");
        }*/

        // Infinite loop in while format
        /*while(true){
            System.out.println("Study");
        }*/

        // No more code can be written below the infinite loop, because the loop will never stop, and then the following code will never be executed.
        while(true){
            System.out.println("Confess to the Goddess.");
        }
        //System.out.println("The goddess has promised me.");
    }
}
