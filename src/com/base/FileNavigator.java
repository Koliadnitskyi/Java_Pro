package com.base;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {
    private static final Map<String, List<FileData>> directory = new HashMap<>();

    public static Map<String, List<FileData>> getDirectory() {
        return directory;
    }

    public static void add(FileData file) {
        for (String s : directory.keySet()) {
            if (file.getPathToFile().equals(s)) {
                directory.get("EntrySetOan").add(file);
            } else {
                List<FileData> listOfFilesTwo = new ArrayList<>();
                listOfFilesTwo.add(file);
                directory.put(file.getPathToFile(), listOfFilesTwo);
            }
        }
    }

    public static List<FileData> find(String key) {
        List<FileData> forReturn = null;
        for (String s : directory.keySet()) {
            if (key.equals(s)) {
                forReturn = directory.get(key);
            }
        }
        return forReturn;
    }

    public static List<FileData> filterBySize(int size) {
        return directory
                .values()
                .stream()
                .flatMap(Collection::stream)
                .filter(f -> f.getSize() <= size)
                .collect(Collectors.toList());
    }

    public static void remove(String key) {
        directory.remove(key);
    }

    public static List<FileData> sortBySize() {
        return directory
                .values()
                .stream()
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void add(FileData failTwo, String key) {
        if (failTwo.getPathToFile().equals(key)) {
            for (String s : directory.keySet()) {
                if (failTwo.getPathToFile().equals(s)) {
                    directory.get("EntrySetOan").add(failTwo);
                } else {
                    List<FileData> listOfFilesTwo = new ArrayList<>();
                    listOfFilesTwo.add(failTwo);
                    directory.put(failTwo.getPathToFile(), listOfFilesTwo);
                }
            }
        } else {
            System.out.println("Результат після виклику перевантаженого методу add: Error: спроба додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів." + "\n");
        }
    }
}
