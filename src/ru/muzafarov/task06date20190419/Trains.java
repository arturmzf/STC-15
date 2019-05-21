package ru.muzafarov.task06date20190419;

public class Trains {

    // Составы
    // Составление поездов

    // public String[] stantionNameNumber = new String[2];
    private String departure;
    private String arrival;
    /*int w; // Количество вагонов*/
    private Locomotives loco;
    private Wagons[] train;

    public Trains(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Trains(String departure, String arrival, Locomotives loco, Wagons[] train) {
        this.departure = departure;
        this.arrival = arrival;
        this.loco = loco;
        this.train = train;
    }

    /*
    - add method message каждого вагона
    - add method message длина состава
    - на усмотрение

     */

    /*Technique[] train = new Technique[w+1]; // +1 - потому что ещё локомотив

    for (int i = 0; i < w+1; i++) {
        train[i] = new Technique();
    }*/
}
