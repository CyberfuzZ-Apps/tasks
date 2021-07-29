package com.proba;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void arrayListDemo() {
        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Начальный размер списочного"
                + " массива а1: " + a1.size());

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Размер списочного массива а1 "
                + "после ввода элементов: "
                + a1.size());

        System.out.println("Содержимое списочного массива а1: " + a1);

        a1.remove("F");
        a1.remove(2);

        a1.trimToSize();

        System.out.println("Размер списочного массива а1 "
                + "после удаления элементов: "
                + a1.size());

        System.out.println("Содержимое списочного массива а1: " + a1);

        a1.add("qq");

        System.out.println("Размер списочного массива а1 "
                + "после trimToSize элементов: "
                + a1.size());

        System.out.println("Содержимое списочного массива а1: " + a1);
    }
}
