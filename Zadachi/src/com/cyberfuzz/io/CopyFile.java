package com.cyberfuzz.io;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFile implements Serializable {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("/Users/cyberfuzz/Desktop/Вавки");
        Path to = Paths.get("/Users/cyberfuzz/Desktop/ВавкиCOPY");
        FileVisitor<Path> fileVisitor = new FileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                String str = String.valueOf(file.toAbsolutePath());
                int index = str.lastIndexOf(".");
                if (index == -1) {
                    return FileVisitResult.CONTINUE;
                }
                String ext = str.substring(index);
                String newPath = str.substring(0, index) + "COPY" + ext;
                Path target = Path.of(newPath);
                Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        };
        Files.walkFileTree(from, fileVisitor);
    }
}
