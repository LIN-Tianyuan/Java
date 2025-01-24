package com.lin.stringjoinerdemo;

import java.util.StringJoiner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringJoinerDemo1 {
    public static void main(String[] args) {
        // 1. Create an object and specify the intervening interval symbols
        StringJoiner sj = new StringJoiner("---");

        // 2. Add elements
        sj.add("aaa").add("bbb").add("ccc");


        // 3. Print results
        System.out.println(sj);//aaa---bbb---ccc
    }
}
