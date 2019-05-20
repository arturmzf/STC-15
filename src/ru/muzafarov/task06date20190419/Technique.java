package ru.muzafarov.task06date20190419;

public class Technique extends RailwayDeportApp {

    // Вся техника в парке (депо): и локомотивы, и вагоны

    public int parkNumber;
    public int number;
    public String name;
    public String movablePower;

    Locomotives lokomotive = new Locomotives(number, name, movablePower);
    Wagons wagon = new Wagons();


}
