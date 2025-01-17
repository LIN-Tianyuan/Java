package com.lin.arraydemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/16
 * @description ：
 * @version: 1.0
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // Format:
        // Static initialization
        // Full Format:
        // datatype [] array name = new datatype []{element1, element2 ....} ;
        // Simplified format:
        // datatype [] array name = {element1, element2....} ;


        // Requirement 1: Define an array to store the ages of 5 students
        int[] arr1 = new int[]{11,12,13,14,15};
        System.out.println(arr1);   // [I@776ec8df
         /* int[] arr2 = {11,12,13,14,15};

        // Requirement 2: Define an array to store the names of 3 students
        String[] arr3 = new String[]{"luna","alex","tom"};
        String[] arr4 = {"luna","alex","tom"};

        // Requirement 3: Define an array to store the heights of 4 students 1.93
        double[] arr5 = new double[]{1.93,1.75,1.73,1.81}; */
        // double[] arr6 = {1.93,1.75,1.73,1.81};
        // System.out.println(arr6);//[D@776ec8df  address value

        //Extension:
        // Explain the meaning of the address value format [D@776ec8df
        // [: indicates that the current array is an array
        // D: indicates that the elements inside the current array are all of type double
        // @ : indicates a spacing symbol. (fixed format)
        // 776ec8df: is the real address value of the array, (hexadecimal)
        // Usually we habitually will call this whole the address value of the array.
    }
}
