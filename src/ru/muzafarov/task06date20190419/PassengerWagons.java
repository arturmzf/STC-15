package ru.muzafarov.task06date20190419;

public class PassengerWagons extends Wagons {

    // Пассажирские вагоны

    private int numberOfPassengers;

    public PassengerWagons(int parkNumber, int length, int weight, int number, int numberOfPassengers) {
        super(parkNumber, length, weight, number);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void message() {
        super.message();
        System.out.println("пассажирским.");
    }

    @Override
    public int fullNumberOfPassengers() {
        return this.numberOfPassengers;
    }

}
