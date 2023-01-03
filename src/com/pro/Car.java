package com.pro;

public class Car {
    private void startElectricity() {
        System.out.println("Start electricity");
    }

    private void startCommand() {
        System.out.println("Start commandy");
    }

    private void startFuelSystem() {
        System.out.println("Start fuel system");
    }

    public void start() {
        System.out.println("Вызываем private методы: startElectricity, startCommand и startFuelSystem");
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
