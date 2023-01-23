package com.phonebook;

public class Record extends Act {

    public Record(String name, int telephone) {
        super(name, telephone);
        Main.testRecord.add(this);
    }

    @Override
    public String toString() {
        return "Record{" + "name='" + getName() + '\'' + ", telephone=" + getTelephone() + '}';
    }
}
