package com.base;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {
    private static final Map<String, List<FileData>> directory = new HashMap<>();

    public static Map<String, List<FileData>> getDirectory() {
        return directory;
    }

    public static void add(FileData fail) {
        for (String s : directory.keySet()) {
            if (fail.getPathToFile().equals(s)) {
                getDirectory().get("/path/to/file").add(fail);
            } else {
                List<FileData> listOfFilesTwo = new ArrayList<>();
                listOfFilesTwo.add(fail);
                directory.put(fail.getPathToFile(), listOfFilesTwo);
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

    public static List<FileData> filterBySize(int meaning) {
        return directory
                .values()
                .stream()
                .flatMap(Collection::stream)
                .filter(f -> f.getSizeInBytes() <= meaning)
                .collect(Collectors.toList());
    }

    public static void remove(String key) {
        directory.remove(key);
    }

    public static List<FileData> sortBySize() {
        Set<FileData> tmp = new TreeSet<>();
        directory
                .values()
                .stream()
                .flatMap(Collection::stream)
                .forEach(tmp::add);
        return new ArrayList<>(tmp);
    }

    public static void add(FileData failTwo, String key) {
        if (failTwo.getPathToFile().equals(key)) {
            for (String s : directory.keySet()) {
                if (failTwo.getPathToFile().equals(s)) {
                    getDirectory().get("/path/to/file").add(failTwo);
                } else {
                    List<FileData> listOfFilesTwo = new ArrayList<>();
                    listOfFilesTwo.add(failTwo);
                    directory.put(failTwo.getPathToFile(), listOfFilesTwo);
                }
            }

        } else {
            System.out.println("Error: спроба додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.");
        }
    }
}
