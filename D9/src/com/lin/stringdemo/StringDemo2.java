package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo2 {
    public static void main(String[] args) {
        // 1. Create two string objects
        String s1 = new String("abc");
        String s2 = "Abc";

        // 2. == Comparison
        // Basic data type: than the data value
        // Reference data type: than the address value
        System.out.println(s1 == s2);//false


        // 3. Compare the contents of the string object is equal or not
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //4. Compare the contents of the string object is equal, ignoring case
        // Ignore case can only be the English state a A
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);//true
    }
}
