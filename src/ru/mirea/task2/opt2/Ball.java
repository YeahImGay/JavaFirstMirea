package ru.mirea.task2.opt2;

public class Ball {
    private double x;
    private double y;
    public Ball(double X, double Y){
        x = X;
        y = Y;
    }
    public Ball(){
        x = 0.0;
        y = 0.0;
    }
    public void setX(double X){
        x = X;
    }
    public double getX(){
        return x;
    }
    public void setY(double Y){
        y = Y;
    }
    public double getY(){
        return y;
    }
    public void setXY(double X, double Y){
        setX(X);
        setY(Y);
    }
    public void move(double xDisp, double yDisp){
        x = x + xDisp;
        y= y + yDisp;
    }
    public String toString(){
        return "Ball("+getX()+", "+getY()+")";
    }
}
