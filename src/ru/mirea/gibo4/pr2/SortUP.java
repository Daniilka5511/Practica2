package ru.mirea.gibo4.pr2;

import java.util.Scanner;

public class SortUP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Number = new int[3];
        for (int z = 0; z < Number.length; z++) {
            System.out.println("Введите число");
            Number[z] = in.nextInt();
        }
        int y;
        for(int i=0;i<Number.length;i++) {
            for(int j=i+1;j<Number.length;j++) {
                if(Number[i] > Number[j]) {
                    y = Number[i];
                    Number[i] = Number[j];
                    Number[j] = y;
                }

            }
            System.out.println(Number[i]);
        }
    }
}