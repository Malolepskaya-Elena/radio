package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

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

    public void prev() {         // предыдущая станция
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {
            this.currentStation = 9;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {         // увеличение звука
        this.currentVolume = currentVolume + 1;
        if (currentVolume == 11) {
            this.currentVolume = 10;
        }
    }

    public void soundReduction() {         // убавление звука
        this.currentVolume = currentVolume - 1;
        if (currentVolume == -1) {
            this.currentVolume = 0;
        }
    }


}
