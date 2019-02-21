package ru.prodaction.bubbleshooter;

import java.awt.*;

public class Player {
    //Fields
    private double x;
    private double y;
    private int r;

    private double dx;  //коэф смещения по х
    private double dy;  //кожф смешения по у

    private int speed;

    private Color color1;
    private Color color2;

    public static boolean UP;
    public static boolean DOWN;
    public static boolean LEFT;
    public static boolean RIGHT;
    public static boolean isFiring;


    //Constructor
    public Player() {
        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;
        r = 5;
        color1 = Color.WHITE;
        speed = 5;

        dx = 0;
        dy = 0;
        UP = false;
        DOWN = false;
        RIGHT = false;
        LEFT = false;
        isFiring = false;
    }

    //Functions
    public void update() {
        if (UP && y > r) {
            dy = -speed;
        }
        if (DOWN && y < GamePanel.HEIGHT - r) {
            dy = speed;
        }
        if (LEFT && x > r) {
            dx = -speed;
        }
        if (RIGHT && x < GamePanel.WIDTH - r) {
            dx = speed;
        }

        if (UP && LEFT || UP && RIGHT || DOWN && LEFT || DOWN && RIGHT) {
            double angle = Math.toRadians(45);
            dy = dy * Math.sin(angle);
            dx = dx * Math.cos(angle);
        }

        y += dy;
        x += dx;

        dy = 0;
        dx = 0;

        if (isFiring){
            GamePanel.bullets.add(new Bullet());
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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
