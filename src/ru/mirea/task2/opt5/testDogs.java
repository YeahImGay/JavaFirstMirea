package ru.mirea.task2.opt5;

public class testDogs{
    public static void main(String[] args) {
        testDog array = new testDog();
        testDog Dog_1 = new testDog("Semen", 2, "Husky");
        testDog Dog_2 = new testDog("Ching Chong Chi", 7, "Shiba-inu");
        array.setSize_arr(2);
        array.setDogs(Dog_1, 0);
        array.setDogs(Dog_2, 1);
        System.out.println(array.array[0]);
        System.out.println(array.array[1]);
    }
}

class testDog {
    private String name;
    private int age;
    private String breed;
    public testDog[] array;

    public testDog(String name, int age, String breed) {
        setName(name);
        setAge(age);
        setBreed(breed);
    }

    public testDog() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSize_arr(int size_arr) {
        array = new testDog[size_arr];
    }

    public void setDogs(testDog Dog, int place) {
        array[place] = Dog;
    }

    public String toString() {
        return "testDog{" + "name = '" + name + '\'' + ", age = " + age + ", breed = '" + breed + '\'' + '}';
    }
}
