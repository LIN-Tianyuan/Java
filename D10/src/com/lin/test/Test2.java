package com.lin.test;
import java.util.ArrayList;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 1. Create a collection
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements
        // Since jdk5, int Integer can be converted to each other.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 3. Iterate over the collection
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
