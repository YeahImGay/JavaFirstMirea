package ru.mirea.task8.opt1;

import java.awt.*;
import java.util.Random;

public class ShapeGeneration {
    private int X;
    private int Y;
    private int Wth;
    private int Lth;
    private int caseNum;

    public int getX() {
        return Y;
    }

    public int getY() {
        return X;
    }

    public int getWth() {
        return Wth;
    }

    public int getLth() {
        return Lth;
    }

    public int getCaseNum() {
        return caseNum;
    }

    protected void shapeGenerator(){
        Random rnd = new Random();
        caseNum = rnd.nextInt(3);
        switch (caseNum) {
            case 0:
                int radius = rnd.nextInt(100) + 10;
                X=rnd.nextInt(1080);
                Y=rnd.nextInt(1920);
                Circle circ = new Circle(radius, "", true, X, Y);
                Wth=radius;
                Lth=radius;
                break;
            case 1:
                X=rnd.nextInt(1080);
                Y=rnd.nextInt(1920);
                int width = rnd.nextInt(100) + 10;
                int length = rnd.nextInt(100) + 10;
                Rectangle rect = new Rectangle(width, length, "", true, X, Y);
                Wth=width;
                Lth=length;
                break;
            case 2:
                X=rnd.nextInt(1080);
                Y=rnd.nextInt(1920);
                int side = rnd.nextInt(100) + 10;
                Square sq = new Square(side, "", true, X, Y);
                Wth=side;
                Lth=side;
                break;
        }
    }

    protected Color colourGenerator(){
        Random rnd = new Random();
        int colNum = rnd.nextInt(5);
        Color colour;
        switch (colNum){
            case 0:
                colour = Color.BLACK;
                break;
            case 1:
                colour = Color.BLUE;
                break;
            case 2:
                colour = Color.RED;
                break;
            case 3:
                colour = Color.GREEN;
                break;
            case 4:
                colour = Color.MAGENTA;
                break;
            default:
                colour = Color.BLACK;
        }
        return colour;
    }
}
