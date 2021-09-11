package ru.mirea.gibo4.pr2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        System.out.println("Как вас зовут?");
        //String nik = in.nextLine();
        //int i = 2;
        System.out.println("Привет," +nik + ",я компьютер");
        */
        /*
        int a,b,c;
        System.out.println("Введите число");
        a = in.nextInt();
        System.out.println("Введите число");
        b = in.nextInt();
        c = a+b;
        System.out.println("c = "+c);
        */
        /*
        double[] array ={3.14, 4.15, 5.10};
        for(int i = 0; i<array.length;i++){
            System.out.println("Array[" + i + "]="+ array[i]);
            }

        double k=0;
        for (int i =0; i < array.length;i++){
            k= k+array[i];
            }
        System.out.println(k);
        }
        */
        int[] var = new int[3];
        for (int i = 0; i < var.length; i++) {
            System.out.println("Введите число");
            var[i] = in.nextInt();
        }
        for (int i = 0; i < var.length; i++) {
            System.out.println("Array[" + i + "]=" + var[i]);
        }
        double del = 0;
        double sum;
        for(int i = 0; i < var.length; i++){
            del= del + var[i];

        }
        sum=del/var.length;
        System.out.println(sum);
    }
}