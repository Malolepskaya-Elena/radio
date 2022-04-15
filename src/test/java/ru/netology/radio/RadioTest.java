package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void test() {            // выставление максмальной станции
        Radio cond = new Radio();

        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNoStation() {     // выставление станции за границей существующих станций
        Radio cond = new Radio();

        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMiddleStation() {  // выставление станции внутри разрешенного диапазона
        Radio cond = new Radio();

        cond.setCurrentStation(5);

        int expected = 5;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMinStation() {  // выставление минимального граничного значения
        Radio cond = new Radio();

        cond.setCurrentStation(0);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNegativStation() {   // выставление станции за минимальной границей
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {   // выставление следующей станции
        Radio cond = new Radio();

        cond.setCurrentStation(9);
        cond.next();

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {   // выставление предыдущей станции
        Radio cond = new Radio();

        cond.setCurrentStation(0);
        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void maxVolume() {   // Увеличение звука выше максимального
        Radio cond = new Radio();

        cond.setCurrentVolume(10);
        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void minVolume() {   // уменьшение звука ниже минимального
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.soundReduction();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);

    }



}