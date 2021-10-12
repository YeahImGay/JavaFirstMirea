package ru.mirea.task6.opt2;

public interface Priceable {
    int getPrice();
}
class potatoBag{
    private int price;
    potatoBag(int Price)
    {
        price = Price;
    }
    public String getPrice(){
        return "Price of potatoes: "+price;
    }
}
class riceBag{
    private int price;
    riceBag(int Price)
    {
        price = Price;
    }
    public String getPrice(){
        return "Price of rice: "+price;
    }
}
class TEA{
    private int price;
    TEA(int Price)
    {
        price = Price;
    }
    public String getPrice(){
        return "TEA: "+price;
    }
}