package ru.muzafarov.task06date20190419;

public class PassengerWagons extends Wagons {

    // Пассажирские вагоны

    private int numberOfPassengers;
    /*public String type; // Эконом, бизнес ENUM!!!*/

    public PassengerWagons(int parkNumber, int length, int weight, int number, int numberOfPassengers) {
        super(parkNumber, length, weight, number);
        this.numberOfPassengers = numberOfPassengers;
    }

    /*public PassengerWagons(int number, int numberOfPassengers, String type) {
        this.number = number;
        this.numberOfPassengers = numberOfPassengers;
        this.type = type;

        message();
    }*/

    @Override
    public void message() {
        super.message();
        System.out.println("И он везёт пассажиров...");
    }
}
