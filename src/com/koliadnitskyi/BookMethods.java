package com.koliadnitskyi;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookMethods {

    private static Stream<String> gettingAllWords(String path) throws IOException {
        try (FileReader tmp = new FileReader(path)) {
            return new BufferedReader(tmp)
                    .lines()
                    .map(x -> x.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replace(",", "")
                            .replace(".", "")
                            .replace("..", "")
                            .replace("...", "")
                            .replace(";", "")
                            .replace(":", "")
                            .replace("?", "")
                            .replace("!", "")
                            .replace("(", "")
                            .replace(")", "")
                            .replace("!..", "")
                            .replace("«", "")
                            .replace("»", ""))
                    .map(String::toLowerCase);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Stream<String> gettingNumberOfWords(String path) throws IOException {
        return gettingAllWords(path).distinct();
    }

    public static List<Map.Entry<String, Integer>> gettingPopularWord(String path) throws IOException {
        List<String> gettingAllUniqueWordsMoreThanTwo = gettingNumberOfWords(path)
                .distinct()
                .filter(s -> s.length() > 2)
                .toList();
        List<String> gettingAllWordsMoreThanTwo = gettingAllWords(path)
                .filter(s -> s.length() > 2)
                .toList();

        int counter = 0;
        Map<String, Integer> gettingPopularWords = new HashMap<>();

        for (String s : gettingAllUniqueWordsMoreThanTwo) {
            for (String value : gettingAllWordsMoreThanTwo) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            gettingPopularWords.put(s, counter);
            counter = 0;
        }
        return gettingPopularWords
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toList());
    }

    public static int gettingNumberOfUniqueWords(String path) throws IOException {
        return (int) gettingNumberOfWords(path)
                .distinct()
                .count();
    }

    public static void writingToFile(String data, String name) {
        try (PrintWriter savingStatisticalData = new PrintWriter(name)) {
            savingStatisticalData.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось записать данные в файл");
        }
    }
}
