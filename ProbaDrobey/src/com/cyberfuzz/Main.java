package com.cyberfuzz;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    private static int chislitel1;
    private static int znaminatel1;
    private static int chislitel2;
    private static int znaminatel2;
    private static char deystvie;
    private static String drob = "—";

    public static void main(String[] args) throws IOException {

        System.out.print("Введите первый числитель : ");
        chislitel1 = in.nextInt();
        System.out.print("Введите первый знаменатель: ");
        znaminatel1 = in.nextInt();
        System.out.print("Введите действие: ");
        deystvie = (char) System.in.read();
        System.out.print("Введите второй числитель: ");
        chislitel2 = in.nextInt();
        System.out.print("Введите второй знаменатель: ");
        znaminatel2 = in.nextInt();

        int obschiy_znamenatel = znaminatel1 * znaminatel2;
        int obschiy_chislitel1 = obschiy_znamenatel / znaminatel1 * chislitel1;
        int obschiy_chislitel2 = obschiy_znamenatel / znaminatel2 * chislitel2;


        System.out.println(chislitel1 + "   " + chislitel2 + "   " + (obschiy_chislitel1 + obschiy_chislitel2));
        System.out.println(drob + " " + deystvie + " " + drob + " = " + drob);
        System.out.println(znaminatel1 + "   " + znaminatel2 + "   " + obschiy_znamenatel);
        

    }
}
