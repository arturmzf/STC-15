package ru.muzafarov.task06date20190419;

public class Wagons extends Technique {

    // Вагоны: и грузовые, и пассажирские

    private int length;
    private int weight;

    public Wagons(int parkNumber, int length, int weight, int number) {
        super(parkNumber, number);
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void message() {
        System.out.print("вагон данного состава является ");
    }

    public int fullNumberOfPassengers() {
        return 0;
    }

}
