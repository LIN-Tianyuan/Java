package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringDemo12 {
    public static void main(String[] args) {
        // 1. Get what was said
        String talk = "You play really well. Don't ever play again. Fuck, CNM.";


        // 2. Define a library of sensitive words
        String[] arr = {"Fuck","CNM","SB","MLGB"};


        // 3. Loop to get each sensitive word in the array and replace it in turn
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        // 4. Print results
        System.out.println(talk);
    }
}
