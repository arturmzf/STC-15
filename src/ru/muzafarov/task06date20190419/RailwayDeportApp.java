package ru.muzafarov.task06date20190419;

public class RailwayDeportApp {

    // Главный класс

    public static void main(String[] args) {

        Locomotives loco = new Locomotives(3030, "ЧС-7", "electrical", 5353);
        Wagons[] wagons = new Wagons[] {
            new PassengerWagons(7070, 30, 50, 8566985, 54),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.OPEN_WAGON)
        };

        Trains train = new Trains(
                "Kazan", "Krasnodar", loco, wagons
        );

    // Вывод
    }

}
