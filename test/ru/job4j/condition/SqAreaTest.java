package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
/*
 p = 4, k = 1, s = 1, real = 1.0
 p = 6, k = 2, s = 2, real = 2.0
*/
    @Test
    public void whenP4K1Then1() {
        int expected = 1;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p,k);
        Assert.assertEquals(out,expected,0.01);
    }
    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p,k);
        Assert.assertEquals(out,expected,0.01);
    }
}