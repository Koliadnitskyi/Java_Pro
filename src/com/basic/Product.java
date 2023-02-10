package com.basic;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private final int ID;
    private final Type type;
    private final BigDecimal price;
    private final boolean isDiscount;
    private final LocalDate added;

    public Product(int ID, Type type, BigDecimal price, boolean isDiscount, LocalDate added) {
        this.ID = ID;
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.added = added;
    }

    public LocalDate getAdded() {
        return added;
    }

    public int getID() {
        return ID;
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
                + "IDnumber=" + ID
                + ", type='" + type + '\''
                + ", price=" + price
                + ", isDiscount=" + isDiscount
                + ", added=" + added + '}';
    }
}
