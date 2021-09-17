package ru.mirea.gibo4.pr2;

import java.util.Scanner;

public class Srednee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            array[i] = in.nextInt();
        }
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
            System.out.println(average);
        }
    }
}
