package com.basic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> goodsOne = new ArrayList<>() {
            {
                add(new Product(894729, Type.BOOK, new BigDecimal("251.8"), false, LocalDate.of(1983, 5, 25)));
                add(new Product(984937, Type.TABLE, new BigDecimal("1631"), true, LocalDate.of(1993, 6, 24)));
                add(new Product(129863, Type.BOOK, new BigDecimal("177"), true, LocalDate.of(1984, 7, 23)));
                add(new Product(176540, Type.BEER, new BigDecimal("44"), true, LocalDate.of(2023, 1, 22)));
                add(new Product(562197, Type.BOOK, new BigDecimal("299"), false, LocalDate.of(1985, 9, 21)));
                add(new Product(640911, Type.CUP, new BigDecimal("77"), true, LocalDate.of(1995, 10, 20)));
                add(new Product(229012, Type.BOOK, new BigDecimal("22.1"), true, LocalDate.of(1986, 2, 1)));
                add(new Product(665421, Type.BIKE, new BigDecimal("6432"), true, LocalDate.of(1996, 12, 5)));
                add(new Product(438751, Type.BOOK, new BigDecimal("74"), false, LocalDate.of(2023, 1, 10)));
                add(new Product(890096, Type.MILK, new BigDecimal("73"), true, LocalDate.now()));
            }
        };
        List<Product> goodsTwo = ProductImplementation.getExpensiveBooks(goodsOne); // реализация п.1.2 Задачи
        System.out.println("Pеализация п.1.2 Задачи: " + goodsTwo);

        List<Product> goodsThree = ProductImplementation.getBooksWithDiscount(goodsOne); // реализация п.2.2 Задачи
        System.out.println("Pеализация п.2.2 Задачи: " + goodsThree);

        Product book = ProductImplementation.gettingBookWithMinimumPrice(goodsOne); // реализация п.3.2 Задачи
        System.out.println("Pеализация п.3.2 Задачи: " + book);

        List<Product> goodsFour = ProductImplementation.gettinglastThreeBooks(goodsOne); // реализация п.4.2 Задачи
        System.out.println("Pеализация п.4.2 Задачи: " + goodsFour);

        BigDecimal totalСost = ProductImplementation.calculationOfTotalCost(goodsOne); // реализация п.5.2 Задачи
        System.out.println("Pеализация п.5.2 Задачи: " + totalСost);

        Map<Type, List<Product>> goodsFive = ProductImplementation.groupingOfObjects(goodsOne); // реализация п.6.2 Задачи
        System.out.println("Pеализация п.6.2 Задачи: " + goodsFive);
    }
}

