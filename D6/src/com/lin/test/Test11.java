package com.lin.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：Two-tone ball (sports)
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        // 1. Generate Winning Numbers
        int[] arr = createNumber(); // 123456  7

        System.out.println("=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("=======================");



        // 2. User enters the lottery number (red + blue) // 654321
        int[] userInputArr = userInputNumber();

        // 3. Determine the user's winning situation
        // Red ball Blue ball
        int redCount = 0;
        int blueCount = 0;

        // Judge the red ball
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    // If it is found, then there is no need to continue comparing the following numbers
                    // Jump out of the inner loop and continue to determine whether the next red ball number is a winner or not
                    break;
                }
            }
        }

        // Judge the blue ball
        int blueNumber = userInputArr[userInputArr.length-1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;
        }

        // Winning is determined by the number of red balls and the number of blue balls.
        if(redCount == 6 && blueCount == 1){
            System.out.println("Congratulations, you've won 10 million dollars.");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("Congratulations, you've won 5 million dollars.");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("Congratulations, you've won 3,000 dollars.");
        }else if((redCount == 5 && blueCount == 0) ||  (redCount == 4 && blueCount == 1)){
            System.out.println("Congratulations, you've won 200 dollars.");
        }else if((redCount == 4 && blueCount == 0) ||  (redCount == 3 && blueCount == 1)){
            System.out.println("Congratulations, you've won 10 dollars.");
        }else if((redCount == 2 && blueCount == 1) ||  (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)){
            System.out.println("Congratulations, you've won 5 dollars.");
        }else{
            System.out.println("Thank you for your participation and patronage!");
        }

    }

    public static int[] userInputNumber() {
        // 1. Create an array for adding the lottery numbers purchased by the user
        // 6 red balls 1 blue ball Array length: 7
        int[] arr = new int[7];

        // 2. Utilize keyboard entry to allow users to input
        Scanner sc = new Scanner(System.in);
        // Let the user enter the red ball number
        for (int i = 0; i < 6; ) {
            System.out.println("Please enter the " + i + " th red ball number: ");
            int redNumber = sc.nextInt();
            // redNumber Unique and non-repeating from 1 to 33.
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    // Does not exist
                    // Valid to add to the array
                    arr[i] = redNumber;
                    i++;
                } else {
                    // exist
                    System.out.println("The current red ball number already exists, please re-enter it: ");
                }
            } else {
                System.out.println("Current red ball number is out of range.");
            }
        }

        // Let the user enter the blue ball number
        System.out.println("Please enter the blue ball number: ");
        // 1~16
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("Current blue ball numbers are out of range.");
            }
        }
        return arr;

    }


    public static int[] createNumber() {
        // 1. Create an array for adding the winning numbers
        // 6 red balls 1 blue ball Array length: 7
        int[] arr = new int[7];

        // 2. Randomly generate numbers and add them to the array.
        // Red ball: non-repeatable 1 2 3 4 5 6
        // Blue ball: can be duplicated with the red ball

        // Generate red numbers and add them to the array.
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            // Get Red Ball Numbers
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                // Add the red numbers to the array
                arr[i] = redNumber;
                i++;
            }
        }

        // Generate blue ball numbers and add them to the array.
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    // Used to determine if an array exists in the array
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
