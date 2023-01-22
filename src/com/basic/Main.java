package com.basic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("Дім");
        test.add("Дім");
        test.add("Дім");
        test.add("Сарделька");
        test.add("Кіт");
        test.add("Дім");
        test.add("Ліхтарик");
        test.add("Дім");
        test.add("Яйце");
        test.add("Дім");
        test.add("Дім");
        test.add("Протез");
        test.add("Дім");
        test.add("Еліватор");
        test.add("Еліватор");
        test.add("Кіт");
        test.add("Дім");
        test.add("Горілка");
        test.add("Дім");
        test.add("Пес");
        ImplementsСounting homework = new ImplementsСounting();
        homework.countOccurance(test, "Дім"); // виклик методу countOccurance, п.1. завдання

        int[] testTwo = {2, 4, 1, 7, 7, 1};
        List<Integer> newListTest = homework.toList(testTwo); // виклик методу toList, п.2. завдання
        System.out.print("Mетод toList, п.2. завдання. Був Array [2, 4, 1, 7, 7, 1], став List: " + newListTest + ".\n");

        List<Integer> newListTestTwo = homework.findUnique(newListTest); // виклик методу findUnique, п.3. завдання
        System.out.print("\nМетод findUnique, п.3. завдання. Був List [2, 4, 1, 7, 7, 1], став List: " + newListTestTwo + " - виключно унікальні числа.\n\n");

        homework.calcOccurance(test); // виклик методу calcOccurance, п.4.** завдання

        List<String> newListTestThree = homework.findOccurance(test); // виклик методу findOccurance, п.4.*** завдання
        System.out.println("\nMетод findOccurance, п.4.*** завдання: ");
        newListTestThree.forEach(System.out::println);
    }
}
