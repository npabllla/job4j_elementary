package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumFrom0To10Is55() {
        int res = Counter.sum(1,10);
        int expected = 55;
        assertThat(res, is(expected));
    }
    @Test
    public void whenSumFrom0To0Is0() {
        int res = Counter.sum(0,0);
        int expected = 0;
        assertThat(res, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom1ToTen10Is30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFrom1ToTen1Is0() {
        int res = Counter.sumByEven(1,1);
        int expected = 0;
        assertThat(res, is(expected));
    }

}