package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import mino.Mino;
import mino.Block;
import mino.Mino_L1;

public class PlayManager {

    // Main Play Area
    final int WIDTH = 320;
    final int HEIGHT = 560;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    // Mino
    Mino currentMino;
    final int MINO_START_X;
    final int MINO_START_Y;

    // Others
    public static int dropInterval = 60; // 60 frames

    public PlayManager() {

        // Main Play Area Frame
        left_x = (GamePanel.WIDTH/2) - (WIDTH/ 2);
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;

        MINO_START_X = left_x + (WIDTH / 2) - Block.SIZE;
        MINO_START_Y = top_y + Block.SIZE;

        // Setting the Starting Mino
        currentMino = new mino.Mino_L1();
        currentMino.setXY(MINO_START_X, MINO_START_Y);
    }

    public void update() {
        currentMino.update();
    }

    public void draw(Graphics2D g2) {

        // Draw Play Area Frame
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x-4, top_y-4, WIDTH, HEIGHT); // Draw the play area frame
    
        // Draw Next Mino Frame
        int x = right_x + 100;
        int y = bottom_y - 200;
        g2.drawRect(x, y, 200, 200);
        g2.setFont(new Font("Arial", Font.PLAIN, 30));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("NEXT", x + 60, y + 60);

        // Draw Current Mino
        if(currentMino != null) {
            currentMino.draw(g2);
        }
    }
}