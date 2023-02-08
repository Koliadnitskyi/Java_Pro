package com.basic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    private final int IDNumber;
    private final String type;
    private final double price;
    private final boolean isDiscount;
    private final LocalDate added;

    public Product(int IDnumber, String type, boolean isDiscount, double price, LocalDate added) {
        this.IDNumber = IDnumber;
        this.type = type;
        this.isDiscount = isDiscount;
        this.price = price;
        this.added = added;
    }

    public static ArrayList<Product> getExpensiveBooks(List<Product> goods) {
        return (ArrayList<Product>) goods
                .stream()
                .filter(s -> s.getPrice() > 250)
                .filter(s -> s.getType().equals("Book"))
                .collect(Collectors.toList());
    }

    public static ArrayList<Product> getDiscountedBooks(List<Product> goods) {
        return (ArrayList<Product>) goods
                .stream()
                .filter(s -> s.getType().equals("Book"))
                .filter(Product::getIsDiscount)
                .map(r -> new Product(r.getIDNumber(), r.getType(), r.getIsDiscount(), r.getPrice() - (r.getPrice() * 10 / 100), r.getAdded()))
                .collect(Collectors.toList());
    }

    public static Product gettingBookWithMinimumPrice(List<Product> goods) {
        try {
            return goods
                    .stream()
                    .filter(s -> s.getType().equals("Book"))
                    .min((x, y) -> (int) (x.getPrice() - y.getPrice()))
                    .orElseThrow(() -> new MyException("Продукт Book не знайдено"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static ArrayList<Product> gettinglastThreeBooks(List<Product> goods) {
        return (ArrayList<Product>) goods
                .stream()
                .sorted(Comparator.comparing(Product::getAdded))
                .skip(goods.size() - 3)
                .collect(Collectors.toList());
    }

    public static double calculationOfTotalCost(List<Product> goods) {
        return goods
                .stream()
                .filter(s -> s.getType().equals("Book"))
                .filter(s -> s.getPrice() < 75)
                .filter(s -> s.getAdded().getYear() > 2022)
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
    }

    public static Map<String, List<Product>> roupingOfObjects(List<Product> goods) {
        return goods
                .stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    public LocalDate getAdded() {
        return added;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsDiscount() {
        return isDiscount;
    }

    @Override
    public String toString() {
        return "Product{"
                + "IDnumber=" + IDNumber
                + ", type='" + type + '\''
                + ", price=" + price
                + ", isDiscount=" + isDiscount
                + ", added=" + added
                + '}';
    }
}
