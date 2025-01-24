package com.lin.stringbuilderdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        // 1. Create an object
        StringBuilder sb = new StringBuilder("abc");

        // 2. Add elements
        /*sb.append(1);
        sb.append(2.3);
        sb.append(true);*/

        // Reverse
        sb.reverse();

        // Get length
        int len = sb.length();
        System.out.println(len);


        // Printing
        // Popularization:
        // Because StringBuilder is a class already written by Java
        // java has done some special handling of him at the bottom.
        // Print objects are not address values but property values.
        System.out.println(sb);

    }
}
