package com.lin.test;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
       /* There are three monks living in a temple and their heights are known to be 150cm, 210cm and 165cm.
        Implement a program to get the maximum height of these three monks. */

        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        // Compare the first monk with the second.
        // Then just take the result and compare it with the third monk.
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
