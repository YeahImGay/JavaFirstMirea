package ru.mirea.task10;

public class Palindrom {
    private static int i=0;
    public static void findIfPal(String word){
        if(i+1<=word.length()/2) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                i++;
                findIfPal(word);
            } else {
                System.out.println("NO");
            }
        }else{
            System.out.println("YES");
        }
    }
    public static void main(String[] args){
        findIfPal("aboba"); //word must NOT have capital letters
    }
}
