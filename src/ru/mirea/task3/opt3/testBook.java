package ru.mirea.task3.opt3;

public class testBook {
    public static void main(String[] args){
        Book book1 = new Book("Coin Locker Babies","Ryu Murakami",1980);
        Book book2 = new Book("Sword of Destiny","Andrzej Sapkowski", 1992);
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866);
        System.out.println(book2);
        book2.setName("Sun of the Dead");
        book2.setAuthor("Ivan Shmelev");
        book2.setYear(1926);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
