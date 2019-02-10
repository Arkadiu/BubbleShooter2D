package ru.prodaction.bubbleshooter;

import javax.swing.*;

public class GameStart {

    public static void main(String[] args){

        JFrame startFrame = new JFrame("Bubble Shooter 2D");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //закрытие приложения крестиком

        startFrame.setContentPane(new GamePanel());
        startFrame.pack();
        startFrame.setLocationRelativeTo(null);                         //позиция окна по центру
        startFrame.setVisible(true);                                    //сделать окно видимым

    }
}
