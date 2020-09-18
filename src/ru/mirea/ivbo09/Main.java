package ru.mirea.ivbo09;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int task=scanner.nextInt();
        switch(task){
            case 1:
                int Array[]={23, 5, 12, 33, 9, 10, 11, 6};
                int value=0;
                for (int i = 0; i < Array.length; i++) {
                    value+=Array[i];
                }
                System.out.println("Value = " + value);
            case 2:


        }

    }
}
