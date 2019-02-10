package ru.prodaction.bubbleshooter;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //Field
    public static int WIDTH = 400;
    public static int HEIGHT = 400;
    private Thread thread = new Thread(this);

    //Constructor
    public GamePanel() {
        super();

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
        thread.start();
    }

    //Functions
    @Override
    public void run() {
        while (true) {       //TODO States

            gameUpdate();
            gameRender();

            try {
                thread.sleep(33);   //TODO FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void gameUpdate() {
        /*
        player.update();
        enemy.update();
        */
    }

    public void gameRender() {

    }
}
