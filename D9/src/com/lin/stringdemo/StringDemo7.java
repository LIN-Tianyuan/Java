package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String str = arrToString(arr);
        System.out.println(str);    // [123
    }



    // 1. What am I going to do? --- Iterate through the array and splice the array into a string
    // 2. what do I need to do this to get it done? --- The array.
    // 3. Do I return the result to the caller when I'm done --- return a concatenated string?
    // If the caller needs to continue using it, then it must be returned.
    // If the caller doesn't need to continue using it, then it may or may not be returned.
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }

        if(arr.length == 0){
            return "[]";
        }

        String result = "[";
        // What does it mean when the code executes here?
        // Indicates that the array is not null, nor is it of length 0
        for (int i = 0; i < arr.length; i++) {
            // i index arr[i] element
            if(i == arr.length - 1){
                result = result + arr[i];
            }else{
                result = result + arr[i] + ", ";
            }
        }
        // Splicing right brackets at this point
        result = result + "]";
        return result;
    }
}
