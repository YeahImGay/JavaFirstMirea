package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ImageWindow {
    public static void main(String[] args){
        String path = args[0];
        JFrame frame = new JFrame("Image");
        frame.setSize(1266, 1292);
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
