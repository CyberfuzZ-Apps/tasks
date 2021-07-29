package com.cyberfuzz.io;

import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldInFile {
    public static void main(String[] args) throws IOException {
        try (FileWriter fileWriter = new FileWriter("./Data/HelloWorld.txt")) {
            String str = "Hello World!!!";
            fileWriter.write(str);
        }
    }
}
