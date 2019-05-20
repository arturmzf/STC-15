package ru.muzafarov.task06date20190419;

public class Locomotives extends Technique {

    // Локомотивы

    private int number; // Инвертарник
    public String name; // ВЛ-80, ЧС-7 ENAM!!!
    public String movablePower; // Электричество, дизтопливо

    public Locomotives(int number, String name, String movablePower) {
        this.number = number;
        this.name = name;
        this.movablePower = movablePower;
    }
}
