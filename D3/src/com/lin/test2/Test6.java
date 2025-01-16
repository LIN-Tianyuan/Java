package com.lin.test2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：Guess number
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        // Requirements: the program automatically generates a random number between 1-100, using the program to achieve guess what the number is?
        // Extension of a small demand: add a guaranteed mechanism, 3 guesses do not hit, directly prompted to guess.

        // Note:
        // The code to generate the random number int number = r.nextInt(100) + 1;
        // Can't be written inside the loop, otherwise a new random number will be generated every time.


        // Counter
        // Used to count how many guesses have been made so far.
        int count = 0;
        // Analyze
        // 1. Generate a random number between 1 and 100
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        // 2. Guess what this number is
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter the number you want to guess: ");
            int guessNumber = sc.nextInt();

            // 3 . Judge two numbers gives different hints
            // Guess the number that is bigger, hint Bigger
            // Guess a smaller number, hint Smaller.
            // Guess the same number, hint is Correct.
            count++;
            if(count == 3){
                System.out.println("Correct!");
                break;
            }
            if(guessNumber > number){
                System.out.println("Bigger");
            }else if(guessNumber < number){
                System.out.println("Smaller");
            }else{
                System.out.println("Correct!");
                break;
            }
        }


    }
}
