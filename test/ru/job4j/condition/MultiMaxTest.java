package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(13, -4, 7);
        assertThat(result, is(13));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(-10, -5, -1);
        assertThat(result, is(-1));
    }

    @Test
    public void whenEachElementMax() {
        int result = MultiMax.max(-10, -10, -10);
        assertThat(result, is(-10));
    }
}