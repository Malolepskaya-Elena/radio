package ru.netology.radio;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {         // следующая станция
        this.currentStation = currentStation + 1;
        if (currentStation == 10) {
            this.currentStation = 0;
        }
    }

}
