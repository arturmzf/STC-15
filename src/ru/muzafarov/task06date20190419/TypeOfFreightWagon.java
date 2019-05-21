package ru.muzafarov.task06date20190419;

public enum TypeOfFreightWagon {

    HOPPER_CAR("Хоппер", "Сыпучие"),
    DUMP_CAR("Думпкар, вагон-самосвал", "Сыпучие"),
    CISTERN_TANK_CAR("Вагон-цистерна", "Жидкости, газы"),
    COVERED_GOODS_WAGON("Крытый", "Грузы, требующие защиты от атмосферных осадков"),
    OPEN_WAGON("Полувагон", "Грузы, НЕ требующие защиты от атмосферных осадков"),
    FLAT_WAGON("Платформа", "Длинномерные, штучные грузы");

    private String typeOfWagon;
    private String typeOfGood;

    public String getTypeOfWagon() {
        return typeOfWagon;
    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    TypeOfFreightWagon(String typeOfWagon, String typeOfGood) {
        this.typeOfWagon = typeOfWagon;
        this.typeOfGood = typeOfGood;
    }
}
