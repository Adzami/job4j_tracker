package ru.job4j.tracker.oop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MaxTest {
    @Test
    public void maxOfThree() {
        assertThat(Max.max(7,3,5), equalTo(7));
    }

    @Test
    public void maxOfFour() {
        assertThat(Max.max(10,3,5, 10), equalTo(10));
    }
}