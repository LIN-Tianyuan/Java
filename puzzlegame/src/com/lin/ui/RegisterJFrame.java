package com.lin.ui;

import javax.swing.*;

/**
 * @author ：lin
 * @date ：Created in 2025/1/31
 * @description ：Register
 * @version: 1.0
 */
public class RegisterJFrame extends JFrame {
    public RegisterJFrame() {
        this.setSize(488, 500);
        // Set title
        this.setTitle("Puzzle Game Register");
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
