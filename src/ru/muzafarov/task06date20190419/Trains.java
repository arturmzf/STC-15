package ru.muzafarov.task06date20190419;

public class Trains {

    // Составы
    // Составление поездов

    private String departure;
    private String arrival;
    private Locomotives loco;
    private Wagons[] train;
    private int fullLength;
    private int fullNumberOfPassengers;

    public Trains(String departure, String arrival, Locomotives loco, Wagons[] train, int num) {
        this.departure = departure;
        this.arrival = arrival;
        this.loco = loco;
        this.train = train;

        for(int l=0; l<train.length; l++) {
            this.fullLength+=train[l].getLength();
        }

        for(int k=0; k<50; k++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Состав № " + num + " готов к отправлению!");
        System.out.println("Станция отправления: " + departure);
        System.out.println("Станция прибытия: " + arrival);
        System.out.println();
        System.out.println("Длина состава: " + this.fullLength);
        System.out.println();
        System.out.println("Единицы состава:");
        for(int i = 0; (i < train.length) && (i < 9); i++) {
            System.out.print("00" + (i+1) + "-й ");
            train[i].message();
            this.fullNumberOfPassengers+=train[i].fullNumberOfPassengers();
        }
        for(int i = 9; (i < train.length) && (i < 99); i++) {
            System.out.print("0" + (i+1) + "-й ");
            train[i].message();
            this.fullNumberOfPassengers+=train[i].fullNumberOfPassengers();
        }
        for(int i = 99; (i < train.length) && (i < 999); i++) {
            System.out.print((i+1) + "-й ");
            train[i].message();
            this.fullNumberOfPassengers+=train[i].fullNumberOfPassengers();
        }
        System.out.println();
        System.out.println("Количество пассажиров в составе: " + this.fullNumberOfPassengers);
        for(int k=0; k<50; k++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println();

    }
}
