package com.cyberfuzz;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.print("Сколько будет дробей? ");
        int i = in.nextInt();

        int [] chisliteli = new int[i];
        int [] znamenateli = new int[i];
        char [] znaki = new char[i - 1];

        for (int j = 0; j < i; j++) {
            System.out.print("Введите числитель : ");
            int a = in.nextInt();
            chisliteli[j] = a;
            System.out.print("Введите знаменатель: ");
            int b = in.nextInt();
            znamenateli[j] = b;
            if (j != i -1) {
                System.out.print("Введите знак: ");
                char znak = (char) System.in.read();
                znaki[j] = znak;
            }

        }
        for (int j = 0; j < i; j++) {
            System.out.print(chisliteli[j] + "     ");
        }
        System.out.println();

        for (int j = 0; j < i; j++) {
            if (j != i - 1) {
                System.out.print("—  " + znaki[j] + "  ");
            } else System.out.print("—  ");
        }
        System.out.println("=  ");

        for (int j = 0; j < i; j++) {
            System.out.print(znamenateli[j] + "     ");
        }


    }
}
