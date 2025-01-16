package com.lin.loopdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/15
 * @description ：break
 * @version: 1.0
 */
public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //2.End the entire loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("The tiger cub is eating his " + i + "th bun.");
            if(i == 3){
                // End the entire loop
                break;
            }
        }
    }
}
