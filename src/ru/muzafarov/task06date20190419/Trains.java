package ru.muzafarov.task06date20190419;

public class Trains extends RailwayDeportApp {

    // Составы
    // Составление поездов

    // public String[] stantionNameNumber = new String[2];
    public String departure;
    public String arrival;
    int w; // Количество вагонов

    public Trains(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    Technique[] train = new Technique[w+1]; // +1 - потому что ещё локомотив

    for (int i = 0; i < w+1; i++) {
        train[i] = new Technique();
    }
}
