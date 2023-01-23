package com.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class Directory {

    private final Record record;

    public Directory(Record record) {
        this.record = record;
    }

    public static List<PhoneDirectory> add(List<Record> testing) {
        List<PhoneDirectory> testPhoneDirectory = new ArrayList<>();
        for (Record o : testing) {
            testPhoneDirectory.add(new PhoneDirectory(o));
        }
        return testPhoneDirectory;
    }

    public static int find(String nameMethod, List<PhoneDirectory> list) {
        int status = 0;
        for (PhoneDirectory phoneDirectory : list) {
            if (phoneDirectory.getRecord().getName().equals(nameMethod)) {
                status = phoneDirectory.getRecord().getTelephone();
                break;
            }
        }
        return status;
    }

    public static List<Integer> findAll(String nameMethodTwo, List<PhoneDirectory> listTwo) {
        List<Integer> testPhoneDirectoryThree = new ArrayList<>();
        for (PhoneDirectory phoneDirectory : listTwo) {
            if (phoneDirectory.getRecord().getName().equals(nameMethodTwo)) {
                testPhoneDirectoryThree.add(phoneDirectory.getRecord().getTelephone());
            }
        }
        if (testPhoneDirectoryThree.size() == 0) testPhoneDirectoryThree.add(null);
        return testPhoneDirectoryThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Directory directory = (Directory) o;
        return Objects.equals(record, directory.record);
    }

    public Record getRecord() {
        return record;
    }
}

