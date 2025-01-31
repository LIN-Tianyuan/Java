package com.lin.ui;

import javax.swing.*;

/**
 * @author ：lin
 * @date ：Created in 2025/1/31
 * @description ：Game
 * @version: 1.0
 */
public class GameJFrame extends JFrame {
    // Main screen of the game
    public GameJFrame() {
        // Initialization
        initJFrame();
        // Init menu
        initJMenuBar();
        // Init image
        initImage();
        // Show
        this.setVisible(true);
    }

    // Init image
    private void initImage() {
        int number = 1;
        // Outer loop: The inner loop is repeated 4 times
        for (int i = 0; i < 4; i++) {
            // Inner loop: Add 4 images in a row
            for (int j = 0; j < 4; j++) {
                // Create an object with an ImageIcon
                ImageIcon icon = new ImageIcon("D:\\Alex\\Info\\Project\\Java\\puzzlegame\\image\\animal\\animal3\\"+ number +".jpg");
                // Create a JLabel object (management container)
                JLabel jLabel = new JLabel(icon);
                // Specify image position
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                // Add the management container to the interface
                this.getContentPane().add(jLabel);
                // After adding once, number needs to be incremented to indicate that the next time the next image is loaded.
                number++;
            }
        }

    }

    private void initJMenuBar() {
        // Create menu object
        JMenuBar jmenuBar = new JMenuBar();
        // Create objects for the two options above the menu (Functions About Us)
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About Us");
        // Create an entry object under Options
        JMenuItem replayItem = new JMenuItem("Replay");
        JMenuItem reLoginItem = new JMenuItem("ReLogin");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem aboutItem = new JMenuItem("About");

        // Add the entries below each option to the options
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(exitItem);

        aboutJMenu.add(aboutItem);

        // Add two options to the menu.
        jmenuBar.add(functionJMenu);
        jmenuBar.add(aboutJMenu);

        // Set up menus for the entire interface
        this.setJMenuBar(jmenuBar);
    }

    private void initJFrame() {
        // Set the width and height of the interface
        this.setSize(603, 680);
        // Set title
        this.setTitle("Puzzle Game");
        // Set Page Top
        this.setAlwaysOnTop(true);
        // Set page center
        this.setLocationRelativeTo(null);
        // Set close mode
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Uncheck the default centering, only then will the components be added according to the XY axis
        this.setLayout(null);
    }
}
