package com.phonebook;

import java.util.List;
import java.util.Objects;

public abstract class WorkingWithData {
    private final String name;
    private final int telephone;

    public WorkingWithData(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public static void print(List<? extends WorkingWithData> list) {
        if (list != null) for (WorkingWithData workingWithData : list) System.out.println(workingWithData);
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkingWithData that = (WorkingWithData) o;
        return telephone == that.telephone && Objects.equals(name, that.name);
    }
}
