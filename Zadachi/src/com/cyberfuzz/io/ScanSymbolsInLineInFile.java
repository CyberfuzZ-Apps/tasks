package com.cyberfuzz.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
Посчитать количество символов в каждой строке файла
 */
public class ScanSymbolsInLineInFile {
    public static void main(String[] args) {
        Path path = Paths.get(".", "Data", "ForScanLines.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String str = bufferedReader.readLine();
            int count = 0;
            while (str != null) {
                System.out.println(str);
                System.out.printf("Line %d excluded %d symbols%n", ++count, str.length());
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
