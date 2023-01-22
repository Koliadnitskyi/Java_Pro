package com.basic;

import java.util.List;

public interface Сounting {
    void countOccurance(List<String> array, String string);

    void calcOccurance(List<String> array);

    List<String> findOccurance(List<String> array);

    List<Integer> toList(int[] array);

    List<Integer> findUnique(List<Integer> array);
}
