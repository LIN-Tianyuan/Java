package com.lin.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * @author ：lin
 * @date ：Created in 2025/1/31
 * @description ：Game
 * @version: 1.0
 */
public class GameJFrame extends JFrame implements KeyListener {
    // Create a two-dimensional array
    // Purpose: to manage data
    int[][] data = new int[4][4];
    // Record the position of the blank squares in the two-dimensional array
    int x = 0, y = 0;
    // Main screen of the game
    public GameJFrame() {
        // Initialization
        initJFrame();
        // Init menu
        initJMenuBar();
        // Initialize data (disrupt)
        initData();
        // Init image (Load the image based on the result of the disruption)
        initImage();
        // Show
        this.setVisible(true);
    }

    // Initialize data (disrupt)
    private void initData() {
        // 1. Define a one-dimensional array
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 2. Reverse the order of the data in the array
        // Iterate through the array, get each element, take the data on the root random index of each element and swap it out
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            // Get the random index
            int index = r.nextInt(tempArr.length);
            // Take each piece of data traversed and swap it with the data on a random index
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        System.out.println();

        // 4. Add data to a two-dimensional array
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }else{
                data[i/4][i%4] = tempArr[i];
            }
        }
    }

    // Init image
    // When adding images, we need to add images according to the data managed in the two-dimensional array
    private void initImage() {
        // Empty all images that were already there
        this.getContentPane().removeAll();
        // Detail:
        // Images loaded first are at the top and images loaded later are at the bottom.
        // Outer loop: The inner loop is repeated 4 times
        for (int i = 0; i < 4; i++) {
            // Inner loop: Add 4 images in a row
            for (int j = 0; j < 4; j++) {
                // Get the current serial number of the image to be loaded
                int number = data[i][j];
                // Create an object with an ImageIcon
                ImageIcon icon = new ImageIcon("puzzlegame\\image\\animal\\animal3\\"+ number +".jpg");
                // Create a JLabel object (management container)
                JLabel jLabel = new JLabel(icon);
                // Specify image position
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // Add Borders to Images
                // 0: Indicates that the picture is made to bulge
                // 1: Indicates to make the picture concave
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // Add the management container to the interface
                this.getContentPane().add(jLabel);
                // After adding once, number needs to be incremented to indicate that the next time the next image is loaded.
                number++;
            }
        }
        // Add background photo
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        // Add a background image to the interface
        this.getContentPane().add(background);

        // Refresh screen
        this.getContentPane().repaint();

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
        // Skype keyboard monitoring for the entire interface
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Make judgments about up and down, left and right
        // Left:37 Up:38 Right:39 Down:40
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            // Call the method to load the image according to the latest number
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                // Indicates that the blank square is already at the bottom, and that there is no picture below him that can be moved anymore
                return;
            }
            // x, y: Blank
            // x+1, y: Underneath the blank block
            // Assign the number below the blank block to the blank square
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            // Call the method to load the image according to the latest number
            initImage();
        } else if (code == 39) {
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            // Call the method to load the image according to the latest number
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            // Call the method to load the image according to the latest number
            initImage();
        }
    }
}
