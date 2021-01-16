package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.nio.channels.Pipe;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenMinus56to38then8246() {
        double expected = 8.246;
        Point first = new Point(-5, 6);
        Point second = new Point(3, 8);
        double out = first.distance(second);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when13Minus7to21then13601() {
        double expected = 13.601;
        Point first = new Point(13, -7);
        Point second = new Point(2, 1);
        double out = first.distance(second);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when000to000then0() {
        double expected = 0;
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 0);
        double out = first.distance3d(second);
        Assert.assertEquals(out, expected, 0.001);
    }

    @Test
    public void when121620to101319hen0() {
        double expected = 3.741;
        Point first = new Point(12, 16, 20);
        Point second = new Point(10, 13, 19);
        double out = first.distance3d(second);
        Assert.assertEquals(out, expected, 0.001);
    }
}