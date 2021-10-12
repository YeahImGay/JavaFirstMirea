package ru.mirea.task1.opt5;

import java.text.DecimalFormat;

public class Harmony {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.print("Harmonic series:");
        for (double i = 1; i <= 10; i++){
            System.out.print(" "+df.format(1/i));
        }
    }
}
