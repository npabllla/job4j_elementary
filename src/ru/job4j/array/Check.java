package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean arr : data) {
            result = data[0] == arr;
        }
        return result;
    }
}
