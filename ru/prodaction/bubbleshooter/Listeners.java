package ru.prodaction.bubbleshooter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listeners implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            Player.UP = true;
        }
        if (key == KeyEvent.VK_S) {
            Player.DOWN = true;
        }
        if (key == KeyEvent.VK_A) {
            Player.LEFT = true;
        }
        if (key == KeyEvent.VK_D) {
            Player.RIGHT = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            Player.UP = false;
        }
        if (key == KeyEvent.VK_S) {
            Player.DOWN = false;
        }
        if (key == KeyEvent.VK_A) {
            Player.LEFT = false;
        }
        if (key == KeyEvent.VK_D) {
            Player.RIGHT = false;
        }
    }
}
