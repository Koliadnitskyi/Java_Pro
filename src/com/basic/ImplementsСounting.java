package com.basic;

import java.util.ArrayList;
import java.util.List;

public class ImplementsСounting implements Сounting {

    @Override
    public void countOccurance(List<String> array, String string) {
        int counter = 0;
        for (Object o : array) {
            if (string.equals(o)) {
                counter++;
            }
        }
        System.out.println("Mетод countOccurance, п.1. завдання. Переданий рядок як другий аргумент зустрічаеться: " + counter + " разів.\n");
    }

    @Override
    public void calcOccurance(List<String> array) {
        System.out.println("Mетод calcOccurance, п.4.**. завдання:");
        ArrayList<String> test = new ArrayList<>();
        test.addAll(0, array);
        for (int u = 0; u < test.size(); u++) {
            for (int r = u; r < test.size() - 1; r++) {
                if (test.get(u).equals(test.get(r))) {
                    test.remove(r);
                }
            }
        }
        for (String s : test) {
            int counter = 0;
            for (String value : array) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            System.out.println(s + ": " + counter);
        }
    }

    @Override
    public List<String> findOccurance(List<String> array) {
        ArrayList<String> test = new ArrayList<>();
        test.addAll(0, array);
        for (int u = 0; u < test.size(); u++) {
            for (int r = u; r < test.size() - 1; r++) {
                if (test.get(u).equals(test.get(r))) {
                    test.remove(r);
                }
            }
        }
        ArrayList<String> testTwo = new ArrayList<>();
        for (String s : test) {
            int counter = 0;
            for (String value : array) {
                if (s.equals(value)) counter++;
            }
            testTwo.add("name: " + s + ", occurrence: " + counter);
        }
        return testTwo;
    }

    @Override
    public List<Integer> toList(int[] array) {
        List<Integer> methodList = new ArrayList<>();
        for (int i : array) {
            methodList.add(i);
        }
        return methodList;
    }

    @Override
    public List<Integer> findUnique(List<Integer> array) {
        for (int u = 0; u < array.size(); u++) {
            for (int r = u; r < array.size() - 1; r++) {
                if (array.get(u).equals(array.get(r + 1))) array.remove(r + 1);
            }
        }
        return array;
    }
}
