package com.lin.listdemo;

import java.util.ArrayList;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */
public class ArrayListDemo2 {
    /*
    boolean add(E e)        add

    boolean remove(E e)     remove
    E remove(int index)

    E set(int index,E e)    modify

    E get(int index)        query
    int size()              get size

 */
    public static void main(String[] args) {

        // 1. Create a collection
        ArrayList<String> list = new ArrayList<>();

        // 2. Add elements
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        // 3. Delete elements
      /*  boolean result1 = list.remove("aaa");
        System.out.println(result1);

        boolean result2 = list.remove("ddd");
        System.out.println(result2);

        String str = list.remove(2);
        System.out.println(str);*/


        // Modify elements
        /*String result = list.set(1, "ddd");
        System.out.println(result);*/

        // Query elements
       /* String s = list.get(0);
        System.out.println(s);*/

        // Iteration
        for (int i = 0; i < list.size(); i++) {
            // i index
            //list.get(i) element
            String str = list.get(i);
            System.out.println(str);
        }


    }
}
