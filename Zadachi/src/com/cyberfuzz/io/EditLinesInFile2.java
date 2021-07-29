package com.cyberfuzz.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
Имеется текстовый файл.
Добавить в него строку из двенадцати черточек (------------),
разместив ее:

б) после последней из строк, в которых нет пробела.
Если таких строк нет, то новая строка должна быть добавлена после всех строк имеющегося файла.

результат записать в другой файл.
 */
public class EditLinesInFile2 {
    public static void main(String[] args) {
        Path from = Paths.get(".", "Data", "ForScanLines.txt");
        Path to = Paths.get(".", "Data", "ResultEditLineInFile2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(from.toFile()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(to.toFile()))) {
            List<String> list = new ArrayList<>();
            int index = 0;
            int mark = -1;
            String str = reader.readLine();
            while (str != null) {
                if (!str.contains(" ")) {
                    mark = index;
                }
                list.add(str);
                index++;
                str = reader.readLine();
            }
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + System.lineSeparator());
                if (mark == i) {
                    writer.write("------------" + System.lineSeparator());
                }
            }
            if (mark == -1) {
                writer.write("------------" + System.lineSeparator());
            }
            writer.flush();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
