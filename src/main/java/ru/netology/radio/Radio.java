package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int allStation) {
        this.maxStation = allStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {         // следующая станция
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }
    }

    public void prev() {         // предыдущая станция
        this.currentStation = currentStation - 1;
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {         // увеличение звука
        this.currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void soundReduction() {         // убавление звука
        this.currentVolume = currentVolume - 1;
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }


}
