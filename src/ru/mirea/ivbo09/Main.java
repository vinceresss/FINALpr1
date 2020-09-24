package ru.mirea.ivbo09;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        switch (task) {
            case 3:
                int Array[] = {23, 5, 12, 33, 9, 10, 11, 6};
                int value = 0;
                for (int i = 0; i < Array.length; i++) {
                    value += Array[i];
                }
                System.out.println("Value = " + value);
            case 4:
                for (String str : args) {
                    System.out.println(args);
                }
            case 5:
                for (double i = 1; i <= 10; i++) {
                    System.out.printf("%5.2f", 1 / i);
                }

            case 6:
                int Array2[] = new int[10];
                int d;
                for (int i = 0; i < 10; i++) {
                    d=(int)(Math.random()*20+1);
                    Array2[i]=d;
                    System.out.print("  "+Array2[i]);
                }
                System.out.println();
                int Array3[]=new int[10];
                Random random = new Random();
                for (int a = 0; a < 10; a++) {
                    int b = random.nextInt(20)+1;
                    Array3[a]=b;
                    System.out.print("  "+Array3[a]);
                }



        }
    }
}
