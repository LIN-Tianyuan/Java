package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringDemo11 {
    public static void main(String[] args) {
        // 1. Getting what was said
        String talk = "You're playing really well. Don't ever play again, damn it.";

        // 2. Replace the sensitive word damn it with **** in there.
        String result = talk.replace("damn it", "***");

        // 3. Print results
        System.out.println(result);
    }
}
