package com.basic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> goodsOne = new ArrayList<>() {
            {
                add(new Product(894729, "Book", false, 251.8, LocalDate.of(1983, 5, 25)));
                add(new Product(984937, "Table", true, 1631, LocalDate.of(1993, 6, 24)));
                add(new Product(129863, "Book", true, 177, LocalDate.of(1984, 7, 23)));
                add(new Product(176540, "Beer", true, 44, LocalDate.of(2023, 1, 22)));
                add(new Product(562197, "Book", false, 299, LocalDate.of(1985, 9, 21)));
                add(new Product(640911, "Cup", true, 77, LocalDate.of(1995, 10, 20)));
                add(new Product(229012, "Book", true, 22.1, LocalDate.of(1986, 2, 1)));
                add(new Product(665421, "Bike", true, 6432, LocalDate.of(1996, 12, 5)));
                add(new Product(438751, "Book", false, 74, LocalDate.of(2023, 1, 10)));
                add(new Product(890096, "Milk", true, 73, LocalDate.now()));
            }
        };
        List<Product> goodsTwo = Product.getExpensiveBooks(goodsOne); // реализация п.1.2 Задачи
        System.out.println("Pеализация п.1.2 Задачи: " + goodsTwo);

        List<Product> goodsThree = Product.getDiscountedBooks(goodsOne); // реализация п.2.2 Задачи
        System.out.println("Pеализация п.2.2 Задачи: " + goodsThree);

        Product book = Product.gettingBookWithMinimumPrice(goodsOne); // реализация п.3.2 Задачи
        System.out.println("Pеализация п.3.2 Задачи: " + book);

        List<Product> goodsFour = Product.gettinglastThreeBooks(goodsOne); // реализация п.4.2 Задачи
        System.out.println("Pеализация п.4.2 Задачи: " + goodsFour);

        double totalСost = Product.calculationOfTotalCost(goodsOne); // реализация п.5.2 Задачи
        System.out.println("Pеализация п.5.2 Задачи: " + totalСost);

        Map<String, List<Product>> goodsFive = Product.roupingOfObjects(goodsOne); // реализация п.6.2 Задачи
        System.out.println("Pеализация п.6.2 Задачи: " + goodsFive);
    }
}

