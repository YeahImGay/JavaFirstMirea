package ru.mirea.task1.opt4;

public class Arguments {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++)
            System.out.println(String.format("Argument %d: %s", i, args[i]));
    }
}
