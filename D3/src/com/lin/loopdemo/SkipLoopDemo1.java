package com.lin.loopdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：continue
 * @version: 1.0
 */
public class SkipLoopDemo1 {
    public static void main(String[] args) {
        //1.Skip a cycle
        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                // End this loop and continue to the next loop
                continue;
            }
            System.out.println("The tiger cub is eating his " + i + "th bun.");
        }

    }
}
