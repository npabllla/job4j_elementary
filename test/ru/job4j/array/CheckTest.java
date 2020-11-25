package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenAllElementsSame() {
        boolean[] input = new boolean[] {true, true, true};
        boolean expect = true;
        boolean result = Check.mono(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAllElementsDifferent() {
        boolean[] input = new boolean[] {true, false, true};
        boolean expect = true;
        boolean result = Check.mono(input);
        assertThat(result, is(expect));
    }
}