package com.phonebook;

import java.util.List;

public class PhoneDirectory extends Directory {
    public PhoneDirectory(Record record) {
        super(record);
    }

    public static void main(String[] args) {
        Record one = new Record("Адольф", 952181776); // створення об'єкту (екземпляру) класу Record
        Record two = new Record("Рудольф", 663418746); // створення об'єкту (екземпляру) класу Record
        Record four = new Record("Рудольф", 934551817); // створення об'єкту (екземпляру) класу Record. Повтор Рудольфа с іншим номером
        Record three = new Record("Вендольф", 973228788); // створення об'єкту (екземпляру) класу Record
        Record five = new Record("Гендольф", 934551817); // створення об'єкту (екземпляру) класу Record
        Record six = new Record("Зендольф", 503421213); // створення об'єкту (екземпляру) класу Record
        Record seven = new Record("Ондольф", 990456623); // створення об'єкту (екземпляру) класу Record
        Record nine = new Record("Сундольф", 959998877); // створення об'єкту (екземпляру) класу Record
        Record ten = new Record("Лендольф", 660987654); // створення об'єкту (екземпляру) класу Record
        Record eleven = new Record("Кендольф", 998761211); // створення об'єкту (екземпляру) класу Record

        Record.print(Directory.testRecord); // друк в консоль всіх об'єктів (екземплярів) ArrayList testRecord з класу Record

        List<PhoneDirectory> testPhoneDirectoryTwo = add(Directory.testRecord); // виклик методу add, п.5. завдання
        print(testPhoneDirectoryTwo); // друк в консоль всіх об'єктів (екземплярів) ArrayList testPhoneDirectoryTwo з класу PhoneDirectory

        Integer telefone = find("Лендольф", testPhoneDirectoryTwo); // виклик методу find, п.6. завдання
        System.out.println(telefone); // друк в консоль результату виконання методу find

        List<Integer> testPhoneDirectoryFour = findAll("Рудольф", testPhoneDirectoryTwo); // виклик методу findAll, п.8.* завдання
        for (Integer integer : testPhoneDirectoryFour) {
            System.out.print(integer + ", ");
        } // друк в консоль результату виконання методу findAll
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" + "record=" + getRecord() + '}';
    }
}

