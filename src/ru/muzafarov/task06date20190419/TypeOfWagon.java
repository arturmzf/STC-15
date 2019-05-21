package ru.muzafarov.task06date20190419;

public enum TypeOfWagon {

    HOPPER("Хоппер", "Сыпучие"),
    CISCIRNA("Цисцерна", "Жидкости, газы"),
    POLUWAGON("Полувагон", "Прочее");

    private String typeOfWagon;
    private String typeOfGood;

    public String getTypeOfWagon() {
        return typeOfWagon;
    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    TypeOfWagon(String typeOfWagon, String typeOfGood) {
        this.typeOfWagon = typeOfWagon;
        this.typeOfGood = typeOfGood;
    }
}
