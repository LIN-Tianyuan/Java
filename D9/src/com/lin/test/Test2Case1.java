package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class Test2Case1 {
    public static void main(String[] args) {
       /* Given two strings, A and B. The rotation operation for A is to move the leftmost character of A to the rightmost.
        The rotation operation of A is to move the leftmost character of A to the rightmost.
        For example, if A = 'abcde', the result is 'bcdea' after one shift.
        If, after a number of adjustments, A can be changed to B, then return True.
        If the match is not successful, then false is returned. */

        // 1. Define two strings
        String strA = "abcde";
        String strB = "bcdea";


        // 2. Calling methods for comparison
        boolean result = check(strA, strB);

        // 3.Print
        System.out.println(result);


    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        // All cases have been compared and are not the same then return false
        return false;
    }


    // Role: rotate the string, move the left side characters to the right side
    // Formal parameter: the string before rotation.
    // Return value: the rotated string.
    public static String rotate(String str) {
        // Set:
        // If we see that we want to modify the contents of the string
        // there can be two ways:
        // 1. use subString for interception, the left side of the characters intercepted out spliced to the right side to go.
        // 2. You can turn the string into a character array first, then adjust the data inside the character array, and finally turn the character array into a string.


        // Intercepting ideas
        // get the leftmost character
        char first = str.charAt(0);
        // Get the remaining characters
        String end = str.substring(1);

        return end + first;
    }
}
