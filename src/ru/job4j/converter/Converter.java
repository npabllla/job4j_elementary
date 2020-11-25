package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return  value / 70;
    }

    public static int rubleToDollar(int value) {
        return  value / 60;
    }

    public static void main(String[] args) {
        int money = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(money);
        boolean passedEuro = expectedEuro == outEuro;
        int expectedDollar = 2;
        int outDollar = Math.round(Converter.rubleToDollar(money));
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(money + " rubles are " + outEuro + " euro. Test result: " + passedEuro);
        System.out.println(money + " rubles are " + outDollar + " dollar. Test result: " + passedDollar);
    }
}

