package ru.muzafarov.task06date20190419;

public class Locomotives extends Technique {

    // Локомотивы

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

}
