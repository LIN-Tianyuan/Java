package com.lin.stringdemo;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class StringDemo4 {
    public static void main(String[] args) {
        // 1. Define two variables to record the correct user name and password
        String rightUsername = "alex";
        String rightPassword = "123456";


        Scanner sc = new Scanner(System.in);
        // 2. Keyboard entry of username and password
        for (int i = 0; i < 3; i++) {// 0 1 2
            System.out.println("Please enter the username:");
            String username = sc.next();
            System.out.println("Please enter the password:");
            String password = sc.next();

            // 3. Comparison
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("User Login Success.");
                break;
            } else {
                if(i == 2){
                    // The last chance to enter also wrong, at this time to prompt the account is locked
                    System.out.println("Account " + username + " is locked, please contact programmer official customer service:XXX-XXXXX.");
                }else{
                    System.out.println("User login failed, user name or password is wrong, you still have " + (2 - i) + " chances left.");  //2 1 0
                }
            }
        }

    }
}
