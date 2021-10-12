package ru.mirea.task1.opt3;

public class Arrays {
    public static void main(String[] args){
        int i;
        int[] a = new int[10];
        for(i = 0; i<10; i++){
            a[i] = (int)(Math.random()*100);
        }
        System.out.print("for: ");
        int Sum=0;
        for(i = 0; i<10; i++){
            Sum=Sum+a[i];
            System.out.print(Sum+" ");
        }
        System.out.println();
        System.out.print("while: ");
        Sum=0;
        i=0;
        while(i<10){
            Sum=Sum+a[i];
            System.out.print(Sum+" ");
            i++;
        }
        System.out.println();
        System.out.print("do while: ");
        Sum=0;
        i=0;
        do{
            Sum=Sum+a[i];
            System.out.print(Sum+" ");
            i++;
        }while(i<10);
        System.out.println();
        System.out.print("Array: ");
        for(i = 0; i<10; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        java.util.Arrays.sort(a);
        for(i = 0; i<10; i++){
            System.out.print(a[i]+" ");
        }
    }
}
