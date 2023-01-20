package com.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Record extends WorkingWithData {
    static List<Record> testRecord = new ArrayList<>();

    public Record(String name, int telephone) {
        super(name, telephone);
        testRecord.add(this);
    }

    @Override
    public String toString() {
        return "Record: " + "name=" + super.getName() + ", telephone=" + super.getTelephone();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
