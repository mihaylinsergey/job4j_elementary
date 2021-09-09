package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenThreeNumbers() {
        int first = 6;
        int second = 7;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFourNumbers() {
        int first = -3;
        int second = 99;
        int third = 0;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 99;
        Assert.assertEquals(result, expected);
    }
}