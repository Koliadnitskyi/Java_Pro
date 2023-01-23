package com.phonebook;

public abstract class Act {
    private final String name;
    private final int telephone;

    public Act(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }
}
