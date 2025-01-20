package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        // In a singing competition, there are 6 judges who score the contestants, and the range of scores is an integer between [0 - 100].
        // The final score of the contestant is the average of the scores of the 4 judges after removing the highest and lowest scores.
        // Complete the above process and calculate the contestant's score.

        // Analysis:
        // 1. Define an array to store the scores of the 6 judges (0~100)
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        // 2. Find the maximum value in the array
        int max = getMax(scoreArr);
        // 3. Find the smallest value in an array
        int min = getMin(scoreArr);
        // 4. Find the sum of the 6 fractions in the array.
        int sum = getSum(scoreArr);
        // 5. (Sum - Maximum - Minimum)/4
        int avg = (sum - max - min) / (scoreArr.length - 2);
        // 6. Print results
        System.out.println("The player's final score is：" + avg);
    }


    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;

    }


    // Find the maximum value of an array
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    // Find the minimum value of an array
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }


    public static int[] getScores() {
        // Defining arrays
        int[] scores = new int[6];
        // Use the keyboard entry form to enter a score: 0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("Please enter the judges' scores: ");
            int score = sc.nextInt();   // 100
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("The score is out of range, continue to enter, the current i is: " + i);
            }
        }
        return scores;
    }
}
