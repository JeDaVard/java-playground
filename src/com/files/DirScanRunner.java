package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirScanRunner {
    public static void main(String[] args) throws IOException {
        String dir = ".";
        Files.list(Paths.get(dir)).forEach(System.out::println);

        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(Path.of(dir), 4).filter(predicate).forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> dirMatcher = (path, attr) -> attr.isDirectory();
        Files.find(Path.of(dir), 2, dirMatcher).forEach(System.out::println);
    }
}
