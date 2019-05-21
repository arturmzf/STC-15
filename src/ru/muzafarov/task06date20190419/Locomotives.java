package ru.muzafarov.task06date20190419;

public class Locomotives extends Technique {

    // Локомотивы

    private int number; // Инвертарник
    private String name; // ВЛ-80, ЧС-7 ENAM!!!
    private String movablePower; // Электричество, дизтопливо

    public Locomotives(int number, String name, String movablePower, int parkNumber) {
        super(parkNumber);
        this.number = number;
        this.name = name;
        this.movablePower = movablePower;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovablePower() {
        return movablePower;
    }

    public void setMovablePower(String movablePower) {
        this.movablePower = movablePower;
    }
}
