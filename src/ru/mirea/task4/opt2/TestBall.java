package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String[] args){
        Ball ball0 = new Ball();
        Ball ball1 = new Ball(7.6, 16.9);
        System.out.println(ball0);
        System.out.println(ball1);
        ball0.setXY(123.54, 678.09);
        ball1.move(2.4, -6.9);
        System.out.println(ball0);
        System.out.println(ball1);
    }
}
