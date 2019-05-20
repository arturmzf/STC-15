package ru.muzafarov.task06date20190419;

public class Wagons extends Technique {

    // Вагоны: и грузовые, и пассажирские

    public int length;
    public int weight;
    int number;
    int numberOfPassengers;
    String type;

    PassengerWagons passengerWagons = new PassengerWagons(number, numberOfPassengers, type);
    FreightWagons freightWagons = new FreightWagons(number, type);

    public void Message() {

        System.out.println("Это вагон...");

    }

}
