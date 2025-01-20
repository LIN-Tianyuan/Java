package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Test8 {
    public static void main(String[] args) {
     /*A numeric password (greater than 0) for a particular system. 1983, for example, is transmitted using the encryption
        The rules are as follows:
            Add 5 to each digit
            And then by adding the remainder to 10.
            And finally invert all the digits to
            and then invert all the numbers to get a new string of numbers.
            Decrypt according to the above rules:
            For example, 1983 becomes 8346 after encryption, and 1983 after decryption.
        */


        // 1. Define an array to record the result after decryption
        int[] arr = {8, 3, 4, 6};
        // 2. Invert
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 3. Since the encryption is obtained by taking the remainder of 10
        // So when decrypting it is necessary to determine, between 0~4 +10 5~9 numbers remain unchanged
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }
        // 4. Each minus 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        // 5. Get an array of each of the numbers inside the splice into the final result
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}
