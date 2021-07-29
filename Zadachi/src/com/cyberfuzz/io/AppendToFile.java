package com.cyberfuzz.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("./Data/ForRandomAccess.txt",
                             "rw")) {
            long len = randomAccessFile.length();
            randomAccessFile.seek(len);
            randomAccessFile.writeUTF(System.lineSeparator() + "This is appended line");
        }
    }
}
