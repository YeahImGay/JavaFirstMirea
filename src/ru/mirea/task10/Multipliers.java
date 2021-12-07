package ru.mirea.task10;

public class Multipliers {
    public static void findMulti(int number){
        if(number != 1){
            for(int i = 2; i <= number; i++) {
                if(number % i == 0){
                    System.out.println(i);
                    number = number / i;
                    findMulti(number);
                    break;
                }
            }
        }else{
            System.out.println(number);
        }
    }
    public static void main(String[] args){
        findMulti(1234567890);
    }
}
