package ru.mirea.task5.opt2;

public class TestDog {
    public static void main(String[] args){
        Dog dog1 = new Dog("Mukhtar", 8);
        Dog dog2 = new Dog("Semen");
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        dog2.setAge(3);
        dog3.setName("Ching Chong Chi");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }
}
