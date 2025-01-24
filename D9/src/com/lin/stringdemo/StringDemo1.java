package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo1 {
    public static void main(String[] args) {
        // 1. Use direct assignment to get a string object
        String s1 = "abc";
        System.out.println(s1); // abc


        // 2. Use the new way to get a string object
        // Empty parameter construction: can get a blank string object
        String s2 = new String();
        System.out.println("@" + s2 + "!"); // ""

        // Pass a string and create a new string object based on the contents of the passed string.
        String s3 = new String("abc");
        System.out.println(s3);

        // Pass an array of characters and create a new string object based on the contents of the character array.
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4); // abcd

        // Transmit a byte array and create a new string object based on the contents of the byte array.
        // Application Scenario: In the future, the data transmitted over the network are actually bytes of information.
        // We generally want to convert the byte information into a string, this time we need to use the construct.
        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5); // abcd

    }
}
