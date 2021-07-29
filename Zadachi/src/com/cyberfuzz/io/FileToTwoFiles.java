package com.cyberfuzz.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
Имеется текстовый файл. Все четные строки этого файла записать во второй файл,
а нечетные — в третий файл. Порядок следования строк сохраняется.
 */
public class FileToTwoFiles {
    public static void main(String[] args) {
        Path firstFile = Paths.get(".", "Data", "FirstFile.txt");
        Path secondFile = Path.of(".", "Data", "SecondFile.txt");
        Path thirdFile = Paths.get(".", "Data", "ThirdFile.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFile.toFile()));
             BufferedWriter writer1 = new BufferedWriter(new FileWriter(secondFile.toFile()));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter(thirdFile.toFile()))) {
            List<String> list = new ArrayList<>();
            String str = reader.readLine();
            while (str != null) {
                list.add(str);
                str = reader.readLine();
            }
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    writer2.write(list.get(i) + System.lineSeparator());
                } else {
                    writer1.write(list.get(i) + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
