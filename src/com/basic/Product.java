package com.basic;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private final int id;
    private final Type type;
    private final BigDecimal price;
    private final boolean isDiscount;
    private final LocalDate added;

    public Product(int id, Type type, BigDecimal price, boolean isDiscount, LocalDate added) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.added = added;
    }

    public LocalDate getAdded() {
        return added;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    @Override
    public String toString() {
        return "Product{"
                + "IDnumber=" + id
                + ", type='" + type + '\''
                + ", price=" + price
                + ", isDiscount=" + isDiscount
                + ", added=" + added + '}';
    }
}
