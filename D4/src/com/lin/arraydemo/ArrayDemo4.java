package com.lin.arraydemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
       /* Define an array to hold the names of the 50 students in the class.
        Names are unknown and will be added when the students report. */


        // Format:
        // datatype[] array name = new datatype[length of array];
        // At the time of creation, it is up to us to specify the length of the array, with a default initialization value given by the virtual machine

        String[] arr = new String[50];
        // Add Student
        arr[0] = "tom";
        arr[1] = "luna";
        // Get student
        System.out.println(arr[0]); // tom
        System.out.println(arr[1]); // luna
        System.out.println(arr[2]); // The printout is the default initialization value null

        // The pattern of default initialization values for arrays
        // Integer type: default initialization value 0
        // Decimal type: default initialization value 0.0
        // Character type: default initialization value '\u0000' space
        // Boolean type: default initialization value false
        // Reference data type: default initialization value null
        int[] arr2 = new int[3];
        System.out.println(arr2[0]);    // 0
        System.out.println(arr2[1]);    // 0
        System.out.println(arr2[2]);    // 0
    }
}
