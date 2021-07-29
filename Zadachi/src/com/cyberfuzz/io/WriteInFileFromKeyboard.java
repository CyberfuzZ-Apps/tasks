package com.cyberfuzz.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteInFileFromKeyboard {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter("./Data/FromScanner.txt")) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s%n", "Enter string " + (i + 1) + " : ");
                printWriter.printf("%s%n", scanner.nextLine());
            }
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
