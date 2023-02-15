package com.koliadnitskyi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bookName = new Scanner(System.in);
        System.out.println("Введите имя книги снова или введите End для прекращения работы.");
        for (; ; ) {
            String reading = bookName.nextLine();
            File path = new File(reading);
            if (reading.equals("End")) {
                break;
            } else {
                if (path.exists()) {
                    try {
                        List<Map.Entry<String, Integer>> popularWord = BookMethods.gettingPopularWord(String.valueOf(path));
                        int numberOfUniqueWords = BookMethods.gettingNumberOfUniqueWords(String.valueOf(path));
                        System.out.println("10 самых популярных слов которые имеют больше 2 символов: "
                                + popularWord
                                + ". Количество уникальных слов: "
                                + numberOfUniqueWords
                                + "\nВведите имя книги снова или введите End для прекращения работы.");
                        BookMethods.writingToFile("10 самых популярных слов которые имеют больше 2 символов: "
                                + popularWord
                                + ". Количество уникальных слов: "
                                + numberOfUniqueWords, "Statistics " + path);
                    } catch (IOException e) {
                        System.out.println("Возникла проблема с чтением файла: " + path);
                    }
                } else {
                    System.out.println("Такой книги нет. Введите имя книги снова или введите end для прекращения работы.");

                }
            }
        }
        bookName.close();
    }
}

