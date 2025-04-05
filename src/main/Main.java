package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        window.setLocationRelativeTo(null); // Center the window on the screen
        window.setVisible(true);
    }
}
