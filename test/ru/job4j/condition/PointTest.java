package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenMinus56to38then8246() {
        double expected = 8.246;
        int x1 = -5;
        int y1 = 6;
        int x2 = 3;
        int y2 = 8;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(out, expected,0.01);
    }
    @Test
    public void when13Minus7to21then13601() {
        double expected = 13.601;
        int x1 = 13;
        int y1 = -7;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(out, expected,0.01);
    }
    @Test
    public void when00to00then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(out, expected,0.01);
    }
}