package com.lin.stringbuilderdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }

        System.out.println(sb);
    }
}
