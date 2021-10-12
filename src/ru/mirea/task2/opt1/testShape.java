package ru.mirea.task2.opt1;

public class testShape {
    public static void main(String[] args) {
        Shape ex1 = new Shape("Circle","purple");
        ex1.SetName("Triangle");
        ex1.SetColour("yellow");
        System.out.println(ex1.toString());
    }
}
