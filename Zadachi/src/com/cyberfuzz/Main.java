package com.cyberfuzz;

import java.util.Scanner;

public class Main {

    //public static Scanner in = new Scanner(System.in);

    public static void main (String [] args) {

        int [] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }
        int max = nums[0];
        int min = nums[0];
        int sr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
            sr += nums[i];
        }
        System.out.println();
        System.out.println("Макс = " + max);
        System.out.println("Мин = " + min);
        System.out.println("Среднее = " + sr / nums.length);



    }
}