package com.cyberfuzz.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
Удалить третью строку из файла и результат записать в новый файл
 */
public class DeleteLineFromFile {
    public static void main(String[] args) {
        Path from = Paths.get(".", "Data", "ForScanLines.txt");
        Path to = Paths.get(".", "Data", "ResultDeleteLineInFile.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(from.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(to.toFile()))) {
            String str = reader.readLine();
            int count = 1;
            while (str != null) {
                if (count != 3) {
                    writer.write(str + System.lineSeparator());
                }
                count++;
                str = reader.readLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
