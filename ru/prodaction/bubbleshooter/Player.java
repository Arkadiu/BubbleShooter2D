package ru.prodaction.bubbleshooter;

import java.awt.*;

public class Player {
    //Fields
    private double x;
    private double y;
    private int r;

    private Color color1;
    private Color color2;

    //Constructor
    public Player() {
        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;
        r = 5;
        color1 = Color.WHITE;

    }

    //Functions
    public void update() {

    }

    public void draw(Graphics2D g) {
        g.setColor(color1);
        g.fillOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);
            //
        g.setColor(color1.darker());
        g.drawOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);
        g.setStroke(new BasicStroke(1));
    }
}
