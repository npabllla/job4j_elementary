package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 3, 4, 1, 0};
        int value = 5;
        int out = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(out, is(expect));
    }

    @Test
    public void whenArrayHasNotElementThenMinus1() {
        int[] input = new int[] {5, 3, 4, 1, 0};
        int value = 12;
        int out = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(out, is(expect));
    }
}