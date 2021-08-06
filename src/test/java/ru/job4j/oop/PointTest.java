package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when400to800then4() {
        double expected = 4;
        Point point1 = new Point(4, 0, 0);
        Point point2 = new Point(8, 0, 0);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when240to204then4dot89() {
        double expected = 4.89;
        Point point1 = new Point(6, 3, 1);
        Point point2 = new Point(2, 1, 3);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}