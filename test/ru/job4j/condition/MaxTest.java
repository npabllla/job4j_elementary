package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void  whenMax35to10Then35() {
        int res = Max.max(35, 10);
        assertThat(res, is(35));
    }

    @Test
    public  void whenMax55t55Then55() {
        int res = Max.max(55, 55);
        assertThat(res, is(55));
    }
}