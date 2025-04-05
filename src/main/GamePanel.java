package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 720;
    final int FPS = 60;
    Thread gameThread;
    PlayManager pm;

    public GamePanel() {
        // Panel Settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setLayout(null); // No layout manager, absolute positioning
    
        pm = new PlayManager();
    }

    public void launchGame() {
        gameThread = new Thread(this); // Create a new thread for the game loop
        gameThread.start(); // Start the game loop
    }

    @Override
    public void run() {
        
        // Game Loop
        double drawInterval = 1000000000 / FPS; // Time per frame in nanoseconds
        double delta = 0; // Time difference
        long lastTime = System.nanoTime(); // Get the current time in nanoseconds
        long currentTime; // Current time in nanoseconds

        while(gameThread != null) {
            currentTime = System.nanoTime(); // Get the current time in nanoseconds
            delta += (currentTime - lastTime) / drawInterval; // Calculate the time difference
            lastTime = currentTime; // Update the last time

            if(delta >= 1) { // If enough time has passed
                update(); // Update the game state
                repaint(); // Repaint the panel
                delta--; // Decrease delta by 1
            }
        }
    }

    private void update() {
        pm.update();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        pm.draw(g2);
    }
}
