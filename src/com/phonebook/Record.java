package com.phonebook;

public class Record extends Act {

    public Record(String name, int telephone) {
        super(name, telephone);
        Directory.testRecord.add(this);
    }

    @Override
    public String toString() {
        return "Record{" + "name='" + getName() + '\'' + ", telephone=" + getTelephone() + '}';
    }
}
