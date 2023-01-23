package com.phonebook;

public class PhoneDirectory extends Directory {
    public PhoneDirectory(Record record) {
        super(record);
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" + "record=" + getRecord() + '}';
    }
}

