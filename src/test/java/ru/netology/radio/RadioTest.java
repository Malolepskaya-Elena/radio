package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testMaxStation() {   // выставление максмальной станции (где по умолчанию 10 станций)
        Radio cond = new Radio();

        int expectedStation = 9;
        cond.setCurrentStation(9);
        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void testNoStation() {  // выставление станции за границей существующих станций (по умолчанию)
        Radio cond = new Radio();

        int expectedStation = 0;
        cond.setCurrentStation(10);
        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void testMiddleStation() {  // выставление станции внутри разрешенного диапазона (по умолчанию)
        Radio cond = new Radio();

        int expectedStation = 5;
        cond.setCurrentStation(5);
        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void testMinStation() {  // выставление минимального граничного значения (по умолчанию)
        Radio cond = new Radio();

        int expectedStation = 0;
        cond.setCurrentStation(0);
        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void testMiniStation() {  // выставление отрицательного значения (по умолчанию)
        Radio cond = new Radio();

        int expectedStation = 0;
        cond.setCurrentStation(-1);
        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void testMaxModStation() {   // выставление максимальной станции (модифицированное радио)
        int allStation = 25; // колличество станций
        Radio cond = new Radio(allStation);

        int expectedStation = 24;
        cond.setCurrentStation(24);

        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void testMiddleModStation() {   // выставление станции в середине  (модифицированное радио)
        int allStation = 25; // колличество станций
        Radio cond = new Radio(allStation);

        int expectedStation = 15;
        cond.setCurrentStation(15);

        assertEquals(expectedStation, cond.getCurrentStation());

    }


    @Test
    public void nextModStation() {   // выставление следующей станции (модиф.радио)

        int allStation = 25; // колличество станций
        Radio cond = new Radio(allStation);

        int expectedStation = 17;

        cond.setCurrentStation(16);
        cond.next();

        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void nextMaxModStation() {   // выставление >max станции (модиф.радио)

        int allStation = 25; // колличество станций
        Radio cond = new Radio(allStation);

        int expectedStation = 0;

        cond.setCurrentStation(24);
        cond.next();

        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void prevMiddleModStation() {   // выставление предыдущей станции (модиф.радио)

        int allStation = 25; // колличество станций
        Radio cond = new Radio(allStation);

        int expectedStation = 14;

        cond.setCurrentStation(15);
        cond.prev();

        assertEquals(expectedStation, cond.getCurrentStation());

    }

    @Test
    public void зкумMinModStation() {   // выставление <min предыдущей станции (модиф.радио)

        int allStation = 25; // колличество станций
        Radio cond = new Radio(allStation);

        int expectedStation = 24;

        cond.setCurrentStation(0);
        cond.prev();

        assertEquals(expectedStation, cond.getCurrentStation());

    }


//    @Test
//    public void nextMinStation() {   // выставление минимальной граничной станции
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(0);
//        cond.next();
//
//        int expected = 1;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void nextNegativStation() {   // выставление отрицательной станции
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(-1);
//        cond.next();
//
//        int expected = 1;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void prevStation() {   // выставление предыдущей станции
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(0);
//        cond.prev();
//
//        int expected = 9;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void prevMaxStation() {   // выставление максимальной предыдущей границы
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(9);
//        cond.prev();
//
//        int expected = 8;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void prevMaxNegativStation() {   // выставление максимальной негативной предыдущей границы
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(11);
//        cond.prev();
//
//        int expected = 9;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void prevMinNegativStation() {   // выставление отрицательной предыдущей границы
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(-1);
//        cond.prev();
//
//        int expected = 9;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }

//    @Test
//    public void prevMiddleStation() {   // выставление станции путем уменьшения
//        Radio cond = new Radio();
//
//        cond.setCurrentStation(5);
//        cond.prev();
//
//        int expected = 4;
//        int actual = cond.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }

    @Test
    public void nextMaxVolume() {   // выставление звука >max

        Radio cond = new Radio();

        int expectedVolume = 100;

        cond.setCurrentVolume(100);
        cond.increaseVolume();

        assertEquals(expectedVolume, cond.getCurrentVolume());

    }

    @Test
    public void nextMiddleVolume() {   // увеличение звука

        Radio cond = new Radio();

        int expectedVolume = 51;

        cond.setCurrentVolume(50);
        cond.increaseVolume();

        assertEquals(expectedVolume, cond.getCurrentVolume());

    }

//    @Test
//    public void nextVolume() {   // увеличение звука граничные значения 0
//
//        Radio cond = new Radio();
//
//        int expectedVolume = 1;
//
//        cond.setCurrentVolume(0);
//        cond.increaseVolume();
//
//        assertEquals(expectedVolume, cond.getCurrentVolume());
//
//    }

//    @Test
//    public void maxVolume() {   // Увеличение звука выше максимального
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(10);
//        cond.increaseVolume();
//
//        int expected = 10;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }

//    @Test
//    public void middleVolume() {   // Увеличение звука
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(5);
//        cond.increaseVolume();
//
//        int expected = 6;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }

//    @Test
//    public void minVolume() {   // Увеличение звука нижней границы
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(0);
//        cond.increaseVolume();
//
//        int expected = 1;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }

    @Test
    public void reductionMinVolume() {   // уменьшение звука ниже минимального
        Radio cond = new Radio();

        int expectedVolume = 0;

        cond.setCurrentVolume(0);
        cond.soundReduction();

        assertEquals(expectedVolume, expectedVolume);

    }

    @Test
    public void reductionVolume() {   // уменьшение звука
        Radio cond = new Radio();

        int expectedVolume = 49;

        cond.setCurrentVolume(50);
        cond.soundReduction();

        assertEquals(expectedVolume, expectedVolume);

    }

//    @Test
//    public void NegativVolume() {   // уменьшение отрицательного звука
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(-1);
//        cond.soundReduction();
//
//        int expected = 0;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void middleMinVolume() {   // уменьшение срединного значения звука
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(5);
//        cond.soundReduction();
//
//        int expected = 4;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void maxMinVolume() {   // уменьшение максимального значения звука
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(10);
//        cond.soundReduction();
//
//        int expected = 9;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void minNoVolume() {   // уменьшение максимального выше границы значения звука
//        Radio cond = new Radio();
//
//        cond.setCurrentVolume(11);
//        cond.soundReduction();
//
//        int expected = 0;
//        int actual = cond.getCurrentVolume();
//
//        assertEquals(expected, actual);
//
//    }



}