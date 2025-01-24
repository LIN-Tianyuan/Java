package com.lin.stringbuilderdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringBuilderDemo4 {
    public static void main(String[] args) {
        // 1. Create an object
        StringBuilder sb = new StringBuilder();

        // 2. Add String
        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        System.out.println(sb);     // aaabbbcccddd

        // 3. And then the StringBuilder back to the string
        String str = sb.toString();
        System.out.println(str);    //aaabbbcccddd

    }
}
