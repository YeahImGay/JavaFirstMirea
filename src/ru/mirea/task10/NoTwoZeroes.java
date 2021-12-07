package ru.mirea.task10;

import java.util.Scanner;

public class NoTwoZeroes {
    public static int ifTZ(int a, int b) {
        if (a == 0)
            return 1;
        if (b == 0 && a > 1)
            return 0;
        if (a == 1 && b == 0)
            return 1;
        return (ifTZ(a, b - 1) + ifTZ(a - 1, b - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ifTZ(a,b));
    }
}
