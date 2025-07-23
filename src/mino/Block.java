package mino;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;

public class Block extends Rectangle {

    public int x, y;
    public static final int SIZE = 30; // 30x30 block
    public Color c;

    public Block(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g2) {
        int margin_ = 2;
        g2.setColor(c);
        g2.fillRect(x + margin_, y + margin_, SIZE - (margin_ * 2), SIZE - (margin_ * 2));
    }
}
