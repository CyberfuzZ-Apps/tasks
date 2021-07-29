package com.cyberfuzz.io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScanLinesInFile {
    public static void main(String[] args) {
        Path path = Paths.get(".", "Data", "ForScanLines.txt");
        try (Scanner scanner = new Scanner(path)) {
            int count = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            System.out.printf("This is %d lines in the file %s", count, path.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
