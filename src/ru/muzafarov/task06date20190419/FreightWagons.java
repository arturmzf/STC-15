package ru.muzafarov.task06date20190419;

public class FreightWagons extends Wagons {

    // Грузовые вагоны

    private TypeOfFreightWagon typeOfFreightWagon; // Хоппер, цистерна, полувагон, платформа и др.

    public TypeOfFreightWagon getTypeOfFreightWagon() {
        return typeOfFreightWagon;
    }

    public void setTypeOfFreightWagon(TypeOfFreightWagon typeOfFreightWagon) {
        this.typeOfFreightWagon = typeOfFreightWagon;
    }

    public FreightWagons(int parkNumber, int length, int weight, int number, TypeOfFreightWagon typeOfFreightWagon) {
        super(parkNumber, length, weight, number);
        this.typeOfFreightWagon = typeOfFreightWagon;
    }

    @Override
    public void message() {
        super.message();
        System.out.println("грузовым. Он везёт: " + typeOfFreightWagon.getTypeOfGood());
    }

}
