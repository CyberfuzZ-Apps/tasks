package com.cyberfuzz.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
Имеется текстовый файл.
Добавить в него строку из двенадцати черточек (------------),
разместив ее:
а) после пятой строки;

результат записать в другой файл.
 */
public class EditLinesInFile {
    public static void main(String[] args) {
        Path from = Paths.get(".", "Data", "ForScanLines.txt");
        Path to = Paths.get(".", "Data", "ResultEditLineInFile.txt");
        try (
                BufferedReader reader = new BufferedReader(new FileReader(from.toFile()));
                BufferedWriter writer = new BufferedWriter(new FileWriter(to.toFile()))) {
            String str = reader.readLine();
            int count = 1;
            while (str != null) {
                writer.write(str + System.lineSeparator());
                if (count == 5) {
                    writer.write("------------");
                    writer.write(System.lineSeparator());
                }
                count++;
                str = reader.readLine();
            }
            writer.flush();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

