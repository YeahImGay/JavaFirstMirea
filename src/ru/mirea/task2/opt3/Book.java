package ru.mirea.task2.opt3;

public class Book {
    private String name;
    private String author;
    private int year;
    public Book(String Name, String Author, int Year){
        name = Name;
        author = Author;
        year = Year;
    }
    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String Author){
        author = Author;
    }
    public String getAuthor(){
        return author;
    }
    public void setYear(int Year){
        year = Year;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "Book{Name: "+getName()+", Author: "+getAuthor()+", Year of Publishing: "+getYear()+"}";
    }
}
