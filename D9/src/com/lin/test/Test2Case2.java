package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class Test2Case2 {
    public static void main(String[] args) {
       /* Given two strings, A and B. The rotation operation for A is to move the leftmost character of A to the rightmost.
        The rotation operation of A is to move the leftmost character of A to the rightmost.
        For example, if A = 'abcde', the result is 'bcdea' after one shift.
        If, after a number of adjustments, A can be changed to B, then return True.
        If the match is not successful, then false is returned. */

        // 1. Define two strings
        String strA = "abcde";
        String strB = "ABC";


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
        // Can turn a string into a character array first, then adjust the data inside the character array, and finally turn the character array into a string.


        // "ABC"   ['A','B','C']  ['B','C','A']   new String(character array);
        char[] arr = str.toCharArray();
        // Get the character on index 0.
        char first = arr[0];
        // Move the remaining characters forward one position in sequence
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        // Put the character on the original 0 index to the last index
        arr[arr.length - 1] = first;

        // Creating a String Object with an Array of Characters
        String result = new String(arr);
        return result;
    }
}
