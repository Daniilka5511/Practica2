package ru.mirea.gibo4.pr2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] loc = new int[3];
        for (int i = 0; i < loc.length; i++) {
            System.out.println("Введите число");
            loc[i] = in.nextInt();
        }
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] > max){
                max = loc[i];
            }
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
