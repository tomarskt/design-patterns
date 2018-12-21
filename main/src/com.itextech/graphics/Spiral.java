package com.kforce.graphics;

import java.awt.*;

public class Spiral {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();
        int x = 0, y = 10;
        int len = 160;
        for (int i = 0; i < 8; i++) {
            g.drawLine(x, y, x + len, y);  // right
            x = x + len;
            len = len - 10;
            g.drawLine(x, y, x, y + len);  // down
            y = y + len;
            g.drawLine(x, y, x - len, y);  // left
            x = x - len;
            len = len - 10;
            g.drawLine(x, y, x, y - len);  // up
            y = y - len;
        }

        for (int i = 0; i < 5; i++) {
            drawFace(g, 10 + i * 100, 30);
        }
    }

    public static void drawFace(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 100, 100);
        g.setColor(Color.BLUE);
        g.fillOval(x + 20, y + 30, 20, 20);
        g.fillOval(x + 60, y + 30, 20, 20);
        g.setColor(Color.RED);
        g.drawLine(x + 30, y + 70, x + 70, y + 70);
    }
}
