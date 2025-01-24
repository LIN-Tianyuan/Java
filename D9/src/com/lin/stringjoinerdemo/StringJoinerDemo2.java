package com.lin.stringjoinerdemo;
import java.util.StringJoiner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringJoinerDemo2 {
    public static void main(String[] args) {
        // 1. Create an object
        StringJoiner sj = new StringJoiner(", ","[","]");

        // 2. Add elements
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len);    // 15

        // 3. Print
        System.out.println(sj);     // [aaa, bbb, ccc]

        String str = sj.toString();
        System.out.println(str);    // [aaa, bbb, ccc]

    }
}
