package com.phonebook;

import java.util.List;

public abstract class Action {
    private final String name;
    private final int telephone;

    public Action(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public static void print(List<Record> list) {
        list.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }
}
