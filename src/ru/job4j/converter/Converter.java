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
        double expectedEuro = 2.0;
        double outEuro = Converter.rubleToEuro(money);
        boolean passedEuro = expectedEuro == outEuro;
        double expectedDollar = 2.0;
        double outDollar = Math.round(Converter.rubleToDollar(money));
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(money + " rubles are " + outEuro + " euro. Test result: " + passedEuro);
        System.out.println(money + " rubles are " + outDollar + " dollar. Test result: " + passedDollar);
    }
}

