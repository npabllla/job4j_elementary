package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(int value) {
        return (double) value / 70;
    }

    public static double rubleToDollar(int value) {
        return (double) value / 60;
    }

    public static void main(String[] args) {
        int money = 140;
        double euro = Converter.rubleToEuro(money);
        System.out.println(money + " rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(money);
        System.out.println(money + " rubles are " + dollar + " dollar");
    }
}

