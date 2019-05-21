package ru.muzafarov.task06date20190419;

public class Wagons extends Technique {

    // Вагоны: и грузовые, и пассажирские

    private int length;
    private int weight;
    private int number;
    /*int numberOfPassengers;
    String type;*/

    public Wagons(int parkNumber, int length, int weight, int number) {
        super(parkNumber);
        this.length = length;
        this.weight = weight;
        this.number = number;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    /*PassengerWagons passengerWagons = new PassengerWagons(number, numberOfPassengers, type);
    FreightWagons freightWagons = new FreightWagons(number, type);*/

    public void message() {

        System.out.println("Это вагон...");

    }

}
