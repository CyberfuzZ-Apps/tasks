package com.cyberfuzz.io;

import java.io.Console;

public class ConsoleMethods {
    public static void main(String[] args) {
        Console console = System.console();
        String s = console.readLine();
        console.printf("%s", s);
    }
}
