package com.cyberfuzz.io;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("./Data/Serialization.csv"))) {
            CopyFile copyFile = new CopyFile();
            out.writeObject(copyFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
