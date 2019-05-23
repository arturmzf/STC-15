package ru.muzafarov.task06date20190419;

public class RailwayDeportApp {

    // Главный класс

    public static void main(String[] args) {

        Locomotives locoP01 = new Locomotives(3030, 3030115, TypeOfLocomotive.CHS4T);
        Locomotives locoP02 = new Locomotives(3084, 3084359, TypeOfLocomotive.EP200);
        Locomotives locoF01 = new Locomotives(7240, 7240893, TypeOfLocomotive.VL80);
        Locomotives locoF02 = new Locomotives(7299, 7299561, TypeOfLocomotive.N2TE116U);

        Wagons[] wagonsP01 = new Wagons[] {
                new PassengerWagons(5896, 30, 50, 8566985, 54),
                new PassengerWagons(7070, 30, 50, 8566126, 54),
                new PassengerWagons(9084, 30, 50, 8566344, 54),
                new PassengerWagons(3690, 30, 50, 8544185, 54),
                new PassengerWagons(8450, 30, 55, 2153344, 36),
                new PassengerWagons(7258, 30, 55, 5962464, 36),
                new PassengerWagons(3647, 30, 55, 8258567, 36)
        };

        Wagons[] wagonsP02 = new Wagons[] {
                new PassengerWagons(3472, 30, 50, 8566985, 54),
                new PassengerWagons(7070, 30, 50, 8566126, 54),
                new PassengerWagons(9084, 30, 50, 8566344, 54),
                new PassengerWagons(3690, 30, 50, 8544185, 54),
                new PassengerWagons(8450, 30, 55, 2153344, 36),
                new PassengerWagons(7258, 30, 55, 5962464, 36),
                new PassengerWagons(4781, 30, 55, 8258567, 36),
                new PassengerWagons(8450, 30, 55, 2153344, 36),
                new PassengerWagons(7258, 30, 55, 5962464, 36),
                new PassengerWagons(3647, 30, 55, 8258567, 36)
        };

        Wagons[] wagonsF01 = new Wagons[] {
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 35, 80, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 35, 80, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(7071, 35, 80, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR)
        };

        Wagons[] wagonsF02 = new Wagons[] {
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.CISTERN_TANK_CAR),
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.FLAT_WAGON),
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.FLAT_WAGON),
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.OPEN_WAGON),
                new FreightWagons(9584, 25, 60, 8135624, TypeOfFreightWagon.OPEN_WAGON),
                new FreightWagons(9351, 35, 80, 8135624, TypeOfFreightWagon.DUMP_CAR),
                new FreightWagons(9351, 35, 80, 8135624, TypeOfFreightWagon.DUMP_CAR),
                new FreightWagons(9351, 35, 80, 8135624, TypeOfFreightWagon.DUMP_CAR),
                new FreightWagons(9351, 25, 60, 8135624, TypeOfFreightWagon.HOPPER_CAR),
                new FreightWagons(9351, 25, 60, 8135624, TypeOfFreightWagon.HOPPER_CAR),
                new FreightWagons(9351, 25, 60, 8135624, TypeOfFreightWagon.HOPPER_CAR),
                new FreightWagons(9351, 25, 60, 8135624, TypeOfFreightWagon.HOPPER_CAR),
                new FreightWagons(9351, 25, 60, 8135624, TypeOfFreightWagon.HOPPER_CAR),
                new FreightWagons(8533, 25, 60, 8135624, TypeOfFreightWagon.COVERED_GOODS_WAGON),
                new FreightWagons(8533, 25, 60, 8135624, TypeOfFreightWagon.COVERED_GOODS_WAGON),
                new FreightWagons(8533, 35, 80, 8135624, TypeOfFreightWagon.COVERED_GOODS_WAGON),
                new FreightWagons(8533, 35, 80, 8135624, TypeOfFreightWagon.COVERED_GOODS_WAGON),
                new FreightWagons(8533, 35, 80, 8135624, TypeOfFreightWagon.COVERED_GOODS_WAGON)
        };


        Trains trainP01 = new Trains(
                "Казань", "Краснодар", locoP01, wagonsP01, 1
        );

        Trains trainP02 = new Trains(
                "Казань", "Москва", locoP02, wagonsP02, 2
        );

        Trains trainF01 = new Trains(
                "Москва", "Санкт-Петербург", locoF01, wagonsF01, 3
        );

        Trains trainF02 = new Trains(
                "Калининград", "Владивосток", locoF02, wagonsF02, 4
        );

    // Вывод
    }

}
