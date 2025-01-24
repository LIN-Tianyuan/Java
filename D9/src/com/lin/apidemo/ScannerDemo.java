package com.lin.apidemo;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // 1. Create objects
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        // 2. Receive a decimal
        double result = sc.nextDouble();
        // 3. Output Printing
        System.out.println(result);
    }
}
