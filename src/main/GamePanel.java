package main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class GamePanel extends JPanel {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 720;

    public GamePanel() {
        // Panel Settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setLayout(null); // No layout manager, absolute positioning
    }
}
