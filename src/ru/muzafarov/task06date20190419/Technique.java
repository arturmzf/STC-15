package ru.muzafarov.task06date20190419;

public class Technique {

    // Вся техника в парке (депо): и локомотивы, и вагоны

    private int parkNumber; // Номер депо приписки
    private int number;     // Инвертарный номер (ID)

    public int getParkNumber() {
        return parkNumber;
    }

    public int getNumber() {
        return number;
    }

    public Technique(int parkNumber, int number) {
        this.parkNumber = parkNumber;
        this.number = number;
    }

}
