package com.lin.listdemo;

import java.util.ArrayList;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1. Create the object of the collection
        // Generic: qualifies the type of data stored in the collection
        // ArrayList<String> list = new ArrayList<String>();
        // JDK7.

        // At this point we are creating an object of ArrayList, which is a class already written in java.
        // This class does some processing at the bottom.
        // Printing the object is not the address value, but the content of the data stored in the collection.
        // In the display of the time will take [] to wrap all the data
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
