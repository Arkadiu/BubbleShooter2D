package ru.prodaction.bubbleshooter;

import java.awt.*;

public class Bullet {

    private double x;
    private double y;
    private int r;
    private int speed;
    private Color color;

    //Constructir
    public Bullet() {
        x = GamePanel.player.getX();
        y =  GamePanel.player.getY();
        r = 2;
        speed = 10;
        color = Color.WHITE;
    }

    //Functions
    public void update() {
        y -= speed;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval((int) x, (int) y, r, 2 * r);
    }
}
