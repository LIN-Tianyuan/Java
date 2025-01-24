package com.lin.test;

import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class Test1Case1 {
    public static void main(String[] args) {
       /* Keyboard entry of a string that
        Requirement 1: Length is less than or equal to 9
        Requirement 2: can only be numbers
                Turn the content into Roman numerals
        The following is the relationship between Arabic numerals and Roman numerals:
        Ⅰ-1, Ⅱ-2, Ⅲ-3, Ⅳ-4, Ⅴ-5, Ⅵ-6, Ⅶ-7, Ⅷ-8, Ⅸ IX-9
        Point of Attention:
        There is no 0 in Roman numerals.
        If the number entered by the keyboard contains 0, it can be turned into “ ” (a string of length 0). */


        // 1. Keyboard entry of a string
        // Writing Scanner's code
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Please enter a string: ");
            str = sc.next();
            // 2. Check if the string satisfies the rule
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("The current string does not conform to the rules, please retype it.");
            }
        }

        // Turn the content into Roman numerals
        // The following is a comparison of Arabic numerals with Roman numerals:
        // I-1, II-2, III-3, IV-4, V-5, VI-6, VII-7, VIII-8, IX-9
        // The look-up table method: the numbers create a correspondence with the data
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48; // 1 2 3 4 5
            String s = changeLuoMa(number);
            sb.append(s);
        }

        System.out.println(sb);

    }

    public static String changeLuoMa(int number) {
        // Define an array so that the indexes correspond to the Roman numerals.
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];

    }


    public static boolean checkStr(String str) {//123456
        // Requirement 1: Length is less than or equal to 9
        if (str.length() > 9) {
            return false;
        }

        // Requirement 2: Numbers only
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//0~9
            if (c < '0' || c > '9') {
                return false;
            }
        }

        // Only when all the characters in the string have been judged will I consider the current string to be in compliance with the rule
        return true;
    }
}
