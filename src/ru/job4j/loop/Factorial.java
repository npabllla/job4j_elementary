package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 0; i < n + 1; i++) {
            if(i!=0) result*=i;
        }
        return result;
    }
}