package com.cyberfuzz;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double a, b, c;

        System.out.println("aX^2 + bX + c = 0");

        System.out.print("Введите a: ");
        a = in.nextDouble();
        System.out.print("Введите b: ");
        b = in.nextDouble();
        System.out.print("Введите c: ");
        c = in.nextDouble();

        System.out.println("D = b^2 - 4 * a * c");

        double d = b * b - 4 * a * c;

        System.out.println("D = " + (b * b) + " - 4 * " + a + " * " + c + " = " + d);

        double x1, x2, x;

        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d) / (2 * a));
        x = (-b) / (2 * a);

        if (d < 0) {
            System.out.println("D < 0 : уравнение корней не имеет.");
        } else if (d == 0) {
            System.out.println("D = 0 : уравнение имеет один корень.");
            System.out.println("x = -b / 2a");
            System.out.println("x = " + -b + " / 2 * "+ a + " = " + x);
        } else {
            System.out.println("D > 0 : уравнение имеет два корня.");
            System.out.println("x1,2 = -b +- sqrt(d) / 2a");
            System.out.println("x1 = " + -b + " + " + Math.sqrt(d) + " / " + "2 * " + a + " = " + x1);
            System.out.println("x2 = " + -b + " - " + Math.sqrt(d) + " / " + "2 * " + a + " = " + x2);
        }
    }
}
