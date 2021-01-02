package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FileScanRunner {
    public static void main(String[] args) throws IOException {
        final Path[] paths = {null};
        Path dir = Paths.get(".");
        Files.walk(dir).filter(p -> p.endsWith("text.txt")).forEach(p -> paths[0] = p);

        List<String> lst = List.of("Apple", "Orange", "Peach", "Pineapple", "Grape");
        Random random = new Random();
        Files.write(paths[0], Collections.singleton(lst.get(random.nextInt(5))));

        List<String> lines = Files.readAllLines(paths[0]);
        System.out.println(lines);
    }
}
