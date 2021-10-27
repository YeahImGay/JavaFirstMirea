package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GifImage {
    public static void main(String[] args){
        String path = args[0];
        JFrame frame = new JFrame("Gif");
        frame.setSize(600, 338);
        Image image =Toolkit.getDefaultToolkit().createImage(path);
        JLabel label =new JLabel("");
        ImageIcon imageIcon= new ImageIcon(image);
        imageIcon.setImageObserver(label);
        label.setIcon(imageIcon);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
