package com.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductImplementation {
    public static ArrayList<Product> getExpensiveBooks(List<Product> goods) {
        return (ArrayList<Product>) goods
                .stream()
                .filter(s -> s.getPrice().compareTo(BigDecimal.valueOf(250)) > 0)
                .filter(s -> s.getType().equals(Type.BOOK))
                .collect(Collectors.toList());
    }

    public static ArrayList<Product> getBooksWithDiscount(List<Product> goods) {
        return (ArrayList<Product>) goods
                .stream()
                .filter(s -> s.getType().equals(Type.BOOK))
                .filter(Product::isDiscount)
                .map(r -> new Product(r.getId(), r.getType(), BigDecimal.valueOf(r.getPrice().doubleValue() - (r.getPrice().doubleValue() * 10 / 100)), r.isDiscount(), r.getAdded()))
                .collect(Collectors.toList());
    }

    public static Product gettingBookWithMinimumPrice(List<Product> goods) {
        try {
            return goods
                    .stream()
                    .filter(s -> s.getType().equals(Type.BOOK))
                    .min(Comparator.comparing(Product::getPrice))
                    .orElseThrow(() -> new MyException("Продукт Book не знайдено"));
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Product> gettinglastThreeBooks(List<Product> goods) {
        return (ArrayList<Product>) goods
                .stream()
                .sorted(Comparator.comparing(Product::getAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static BigDecimal calculationOfTotalCost(List<Product> goods) {
        return goods
                .stream()
                .filter(s -> s.getType().equals(Type.BOOK))
                .filter(s -> s.getPrice().compareTo(BigDecimal.valueOf(75)) < 0)
                .filter(s -> s.getAdded().getYear() > 2022)
                .map(Product::getPrice)
                .reduce(BigDecimal.valueOf(0.0), BigDecimal::add);
    }

    public static Map<Type, List<Product>> groupingOfObjects(List<Product> goods) {
        return goods
                .stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
