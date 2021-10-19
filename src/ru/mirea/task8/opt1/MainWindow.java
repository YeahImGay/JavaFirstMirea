package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.Graphics;

public class MainWindow extends JFrame {
    ShapeGeneration Gen = new ShapeGeneration();
    MainWindow() {
        super("Main window");
        setSize(1920, 1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint (Graphics g) {
        for (int i = 0; i < 10; i++) {
            Gen.shapeGenerator();
            if (Gen.getCaseNum() > 0) {
                g.setColor(Gen.colourGenerator());
                g.drawRect(Gen.getX(), Gen.getY(), Gen.getWth(), Gen.getLth());
                g.fillRect(Gen.getX(), Gen.getY(), Gen.getWth(), Gen.getLth());
            } else {
                g.setColor(Gen.colourGenerator());
                g.drawOval(Gen.getX(), Gen.getY(), Gen.getWth(), Gen.getLth());
                g.fillOval(Gen.getX(), Gen.getY(), Gen.getWth(), Gen.getLth());
            }
        }
    }
}
