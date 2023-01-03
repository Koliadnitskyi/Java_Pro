package com.pro;

public class Main {
    public static void main(String[] args) {
        com.basic.SameName sameName = new com.basic.SameName(); //Создание объекта класса SameName из пакета com.basic
        SameName sameName2 = new SameName(); //Создание объекта класса SameName из пакета com.pro
        Car car = new Car(); //Создание объекта класса Car из пакета com.pro
        car.start(); //Вызов public метода start класса Car
        Employee employee = new Employee("Колядніцький Валерій Вікторович", "учень Хілуль", "0164zeos20081@gmail.com", 952181776, 39); ////Создание объекта класса Employee из пакета com.pro
    }
}
