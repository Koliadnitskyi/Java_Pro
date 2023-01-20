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
        if (testing != null) {
            for (Record o : testing) testPhoneDirectory.add(new PhoneDirectory(o));
        }
        return testPhoneDirectory;
    }

    public static Integer find(String nameMethod, List<PhoneDirectory> list) {
        Integer status = null;
        if (nameMethod != null || list != null) {
            for (PhoneDirectory phoneDirectory : list)
                if (phoneDirectory.getRecord().getName().equals(nameMethod)) {
                    status = phoneDirectory.getRecord().getTelephone();
                    break;
                }
        }
        return status;
    }

    public static void print(List<? extends Directory> list) {
        if (list != null) for (Directory directory : list) System.out.println(directory);
    }

    public static List<Integer> findAll(String nameMethodTwo, List<PhoneDirectory> listTwo) {
        List<Integer> testPhoneDirectoryThree = new ArrayList<>();
        if (nameMethodTwo != null || listTwo != null) {
            for (PhoneDirectory phoneDirectory : listTwo)
                if (phoneDirectory.getRecord().getName().equals(nameMethodTwo))
                    testPhoneDirectoryThree.add(phoneDirectory.getRecord().getTelephone());
        }
        if (testPhoneDirectoryThree.size() == 0) testPhoneDirectoryThree.add(null);
        return testPhoneDirectoryThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(record, directory.record);
    }

    public Record getRecord() {
        return record;
    }

    @Override
    public String toString() {
        return "Directory{" + "record=" + record + '}';
    }
}

