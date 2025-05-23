package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Add the GamePanel to the Window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack(); // Adjust the window size to fit the panel

        window.setLocationRelativeTo(null); // Center the window on the screen
        window.setVisible(true);

        gp.launchGame();
    }
}
