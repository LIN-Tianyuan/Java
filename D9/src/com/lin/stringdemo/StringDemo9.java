package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo9 {
    public static void main(String[] args) {
        // 1. Get a cell phone number
        String phoneNumber = "13112349468";

        // 2. Intercept the first three digits of the cell phone number
        String start = phoneNumber.substring(0, 3);

        // 3. Intercept the last four digits of the cell phone number
        String end = phoneNumber.substring(7);

        // 4. Splice
        String result = start + "****" + end;

        // 5. Print
        System.out.println(result);

    }
}
