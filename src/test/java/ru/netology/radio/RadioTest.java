package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void test() {
        Radio cond = new Radio();

        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNoStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMiddleStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        int expected = 5;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMinStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(0);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNegativStation() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

}