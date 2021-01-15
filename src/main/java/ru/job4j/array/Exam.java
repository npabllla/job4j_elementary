package ru.job4j.array;

public class Exam {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0; int j = 0; int k = 0;
        while (i + j < right.length + left.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    rsl[k] = left[i];
                    k++;
                    i++;
                } else {
                    rsl[k] = right[j];
                    k++;
                    j++;
                }
            } else if (i < left.length) {
                rsl[k] = left[i];
                k++;
                i++;
            } else if (j < right.length) {
                rsl[k] = right[j];
                k++;
                j++;
            }
        }
        return rsl;
    }
}
