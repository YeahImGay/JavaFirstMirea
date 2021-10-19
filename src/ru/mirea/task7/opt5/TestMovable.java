package ru.mirea.task7.opt5;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle sq8 = new MovableRectangle(0,7,8,0,8, 7);
        System.out.println(sq8);
        sq8.moveLeft();
        System.out.println(sq8);
        sq8.moveDown();
        System.out.println(sq8);
        MovableCircle circle3 = new MovableCircle(0, 0, 7, 6, 3);
        System.out.println(circle3);
        circle3.moveUp();
        circle3.moveRight();
        System.out.println(circle3);
    }
}
