package ru.mirea.ivbo09;

import java.util.Random;
import java.util.Scanner;


public class Main {
    static int Factorial(int fact) {
        if (fact == 1)
            return 1;
        return (Factorial(fact - 1) * fact);
    }

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
                break;
            case 4:
                for (String str : args) {
                    System.out.println(args);
                }
                break;
            case 5:
                for (double i = 1; i <= 10; i++) {
                    System.out.printf("%5.2f", 1 / i);
                }
                break;

            case 6:
                int Array2[] = new int[10];
                int d;
                System.out.print("Mass 1: ");
                for (int i = 0; i < 10; i++) {
                    d = (int) (Math.random() * 100 + 1);
                    Array2[i] = d;
                    System.out.print("  " + Array2[i]);
                }
                System.out.println();
                boolean sorted = false;
                int temp;
                while (!sorted) {
                    sorted = true;
                    for (int i = 0; i < Array2.length - 1; i++) {
                        if (Array2[i] > Array2[i + 1]) {
                            temp = Array2[i];
                            Array2[i] = Array2[i + 1];
                            Array2[i + 1] = temp;
                            sorted = false;

                        }
                    }
                }
                System.out.print("Mass 1 sorted: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print("  " + Array2[i]);
                }
                System.out.println();
                int Array3[] = new int[10];
                Random random = new Random();
                System.out.print("Mass 2: ");
                for (int a = 0; a < 10; a++) {
                    int b = random.nextInt(100) + 1;
                    Array3[a] = b;
                    System.out.print("  " + Array3[a]);
                }
                System.out.println();
                boolean sort = false;
                int temp2;
                while (!sort) {
                    sort = true;
                    for (int i = 0; i < Array3.length - 1; i++) {
                        if (Array3[i] > Array3[i + 1]) {
                            temp2 = Array3[i];
                            Array3[i] = Array3[i + 1];
                            Array3[i + 1] = temp2;
                            sort = false;

                        }
                    }
                }
                System.out.print("Mass 2 sorted: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print("  " + Array3[i]);
                }
                break;
            case 7:
                int number = scanner.nextInt();
                int number2 = number;
                number = Factorial(number);
                System.out.println("Факториал методом рекурсии = " + number);
                int result = 1;
                for (int i = 1; i <= number2; i++) {
                    result = result * i;
                }
                System.out.print("Проверка = " + result);
                break;

        }
    }
}
