package com.lin.stringdemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/24
 * @description ：
 * @version: 1.0
 */
public class StringDemo10 {
    public static void main(String[] args) {
        // 1. Define a string to record the identity card number
        String id = "321281202001011234";

        // 2. Obtain the date of birth
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);


        System.out.println("Character Information for: ");
        System.out.println("Date of birth: " + year + "-" + month + "-" + day);

        // 3. Access to gender
        char gender = id.charAt(16);//'3'  ---> 3
        //  Conversion using the ASCII code table
        //  '0' --->  48
        //  '1' --->  49
        //  '2' --->  50
        //  '3' --->  51
        //  '4' --->  52
        //  '5' --->  53
        //  '6' --->  54
        //  '7' --->  55
        //  '8' --->  56
        //  '9' --->  57

        int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("Sex: Female");
        }else{
            System.out.println("Sex: Male");
        }
    }
}
