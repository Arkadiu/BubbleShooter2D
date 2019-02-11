package ru.prodaction.bubbleshooter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements Runnable {

    //Field
    public static int WIDTH = 400;
    public static int HEIGHT = 400;

    private Thread thread;

    private BufferedImage image;
    private Graphics2D g;

    public static GameBack background;
    public static Player player;

    //Constructor
    public GamePanel() {
        super();

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();

        addKeyListener(new Listeners());
    }

    //Functions
    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) image.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        background = new GameBack();
        player = new Player();

        while (true) {       //TODO States

            gameUpdate();
            gameRender();
            gameDraw();

            try {
                thread.sleep(33);   //TODO FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void gameUpdate() {
        //Background update
        background.update();

        //Player update
        player.update();

    }

    public void gameRender() {
        //Background draw
        background.draw(g);

        //Player draw
        player.draw(g);
    }

    private void gameDraw() {
        Graphics g2 = this.getGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();                                       //Очистка мусора
    }
}
