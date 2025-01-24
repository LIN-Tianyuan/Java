package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo8 {
    public static void main(String[] args) {
        String result = reverser("abc");
        System.out.println(result);
    }


    // 1. What am I going to do?  --- String inversion
    // 2. what do I need to do this thing to get it done?  --- Need a string
    // 3. Do I need to continue using the result of the method at the call? --- Need the result for output
    public static String reverser(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            // i represents each index in the string in turn (backwards)
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
