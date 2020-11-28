package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max number = new Max();
        int result = (int) number.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void  whenMax35to10to15Then35() {
        Max number = new Max();
        int res = (int) number.max(35, 10, 15);
        assertThat(res, is(35));
    }

    @Test
    public  void whenMax55t55Then55() {
        Max number = new Max();
        int res = (int) number.max(55, 55);
        assertThat(res, is(55));
    }

    @Test
    public  void whenMax10to10to10Then10() {
        Max number = new Max();
        int res = (int) number.max(10, 10, 10);
        assertThat(res, is(10));
    }
}