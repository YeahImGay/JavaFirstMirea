package ru.mirea.task6.opt2;

public class TestPriceable {
    public static void main(String[] args) {
        potatoBag potBag = new potatoBag(100);
        System.out.println(potBag.getPrice());
        riceBag riBag = new riceBag(100);
        System.out.println(riBag.getPrice());
        TEA Tea = new TEA(1000000);
        System.out.println(Tea.getPrice());
    }
}
