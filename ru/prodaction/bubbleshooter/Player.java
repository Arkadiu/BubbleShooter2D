package ru.prodaction.bubbleshooter;

import java.awt.*;

public class Player {
    //Fields
    private double x;
    private double y;
    private int r;

    private int speed;

    private Color color1;
    private Color color2;

    public static boolean UP;
    public static boolean DOWN;
    public static boolean LEFT;
    public static boolean RIGHT;


    //Constructor
    public Player() {
        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;
        r = 5;
        color1 = Color.WHITE;
        speed = 5;
        UP = false;
        DOWN = false;
        RIGHT = false;
        LEFT = false;
    }

    //Functions
    public void update() {
        if (UP && y > r) {
            y -= speed;
        }
        if (DOWN && y < GamePanel.HEIGHT - r) {
            y += speed;
        }
        if (LEFT && x > r) {
            x -= speed;
        }
        if (RIGHT && x < GamePanel.WIDTH - r) {
            x += speed;
        }
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
