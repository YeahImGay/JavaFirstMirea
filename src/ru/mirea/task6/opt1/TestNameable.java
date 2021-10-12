package ru.mirea.task6.opt1;

public class TestNameable {
    public static void main(String[] args) {
        planet Earth = new planet("Earth");
        System.out.println(Earth.getName());
        car Mitsubishi = new car("Mitsubishi");
        System.out.println(Mitsubishi.getName());
        animal Snake = new animal("Snake");
        System.out.println(Snake.getName());
    }
}
