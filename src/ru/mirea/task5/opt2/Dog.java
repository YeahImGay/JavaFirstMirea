package ru.mirea.task5.opt2;

public class Dog {
    private String name;
    private int age;
    public Dog(String Name, int Age){
        name = Name;
        age = Age;
    }
    public Dog(String Name){
        name = Name;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        return(name);
    }
    public void setAge(int Age){
        age = Age;
    }
    public int getAge(){
        return(age);
    }
    public int intoHumanAges(){
        return(age*7);
    }
    public String toString(){
        return "Dog{Name: "+getName()+", Age: "+getAge()+", Dog's age into human ages: "+intoHumanAges()+"}";
    }
}
