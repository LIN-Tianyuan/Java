package com.lin.ui;

import javax.swing.*;

/**
 * @author ：lin
 * @date ：Created in 2025/1/31
 * @description ：
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 1. Create a main screen
        JFrame gameFrame = new JFrame();
        gameFrame.setSize(603, 680);
        gameFrame.setVisible(true);

        // 2. Create a login screen
        JFrame loginFrame = new JFrame();
        loginFrame.setSize(488, 430);
        loginFrame.setVisible(true);

        // 3. Create a registration screen
        JFrame registerFrame = new JFrame();
        registerFrame.setSize(488, 500);
        registerFrame.setVisible(true);
    }
}
