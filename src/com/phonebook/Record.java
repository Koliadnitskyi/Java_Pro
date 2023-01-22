package com.phonebook;

public class Record extends Action {

    public Record(String name, int telephone) {
        super(name, telephone);
        Directory.testRecord.add(this);
    }

    @Override
    public String toString() {
        return "Record{" + "name='" + getName() + '\'' + ", telephone=" + getTelephone() + '}';
    }
}
