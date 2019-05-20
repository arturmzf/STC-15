package ru.muzafarov.task06date20190419;

public class PassengerWagons extends Wagons {

    // Пассажирские вагоны

    private int number; // Инвертарник
    public int numberOfPassengers;
    public String type; // Эконом, бизнес ENUM!!!

    public PassengerWagons(int number, int numberOfPassengers, String type) {
        this.number = number;
        this.numberOfPassengers = numberOfPassengers;
        this.type = type;

        Message();
    }

    @Override
    public void Message() {
        super.Message();
        System.out.println("И он везёт пассажиров...");
    }
}
