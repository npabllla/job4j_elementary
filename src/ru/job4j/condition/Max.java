package ru.job4j.condition;

public class Max {
    public double max(double first, double second) {
     return first > second ? first : second;
    }

    public double max(double first, double second, double third) {
        return max(first, max(second, third));
    }
}