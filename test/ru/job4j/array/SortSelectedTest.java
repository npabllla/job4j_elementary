package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[] {-4, 7, 5, 12, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-4, 5, 6, 7, 12};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {8, -8, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-8, 1, 8};
        assertThat(result, is(expect));
    }
}