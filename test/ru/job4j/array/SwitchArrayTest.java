package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {4, 2, 3, 1};
        int[] out = SwitchArray.swap(input, 0, 3);
        assertThat(out, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {1, 3, 2, 4};
        int[] out = SwitchArray.swap(input, 1, 2);
        assertThat(out, is(expect));
    }

    @Test
    public void whenSwap2to2() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {1, 2, 3, 4};
        int[] out = SwitchArray.swap(input, 2, 2);
        assertThat(out, is(expect));
    }
}