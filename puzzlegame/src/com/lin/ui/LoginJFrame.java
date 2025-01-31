package com.lin.ui;

import javax.swing.*;

/**
 * @author ：lin
 * @date ：Created in 2025/1/31
 * @description ：Login
 * @version: 1.0
 */
public class LoginJFrame extends JFrame {
    // Login screen
    public LoginJFrame() {
        this.setSize(488, 430);
        // Set title
        this.setTitle("Puzzle Game Login");
        // Set Page Top
        this.setAlwaysOnTop(true);
        // Set page center
        this.setLocationRelativeTo(null);
        // Set close mode
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Show
        this.setVisible(true);
    }
}
