package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to00then2() {
        double expected = 2;
        Point point1 = new Point(2, 0);
        Point point2 = new Point(0, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13toMinus1Minus3then6dot32() {
        double expected = 6.32;
        Point point1 = new Point(1, 3);
        Point point2 = new Point(-1, -3);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when60to06then8dot48() {
        double expected = 8.48;
        Point point1 = new Point(6, 0);
        Point point2 = new Point(0, 6);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}