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
        // Show
        this.setVisible(true);
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
    }
}
