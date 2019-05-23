package ru.muzafarov.task06date20190419;

public class Locomotives extends Technique {

    // Локомотивы

    /*private String name; // ВЛ-80, ЧС-7 ENAM!!!
        private String movablePower; // Электричество, дизтопливо*/
    private TypeOfLocomotive typeOfLocomotive;

    public TypeOfLocomotive getTypeOfLocomotive() {
        return typeOfLocomotive;
    }

    public void setTypeOfLocomotive(TypeOfLocomotive typeOfLocomotive) {
        this.typeOfLocomotive = typeOfLocomotive;
    }

    public Locomotives(int parkNumber, int number, TypeOfLocomotive typeOfLocomotive) {
        super(parkNumber, number);
        this.typeOfLocomotive = typeOfLocomotive;
    }

    /*public Locomotives(int number, String name, String movablePower, int parkNumber) {
        super(parkNumber, number);
        this.name = name;
        this.movablePower = movablePower;
    }*/

    /*public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }*/

    /*public String getName() {
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
    }*/
}
