package ru.muzafarov.task06date20190419;

public class FreightWagons extends Wagons {

    // Грузовые вагоны

    private TypeOfWagon typeOfWagon; // Хоппер, цисцерна, полувагон, рефрежиратор, платформа и др. ENUM!!!

    public TypeOfWagon getTypeOfWagon() {
        return typeOfWagon;
    }

    public void setTypeOfWagon(TypeOfWagon typeOfWagon) {
        this.typeOfWagon = typeOfWagon;
    }

    public FreightWagons(int parkNumber, int length, int weight, int number, TypeOfWagon typeOfWagon) {
        super(parkNumber, length, weight, number);
        this.typeOfWagon = typeOfWagon;
    }

    /*public FreightWagons(int number, String type) {
        this.number = number;
        this.type = type;

        Message();
    }*/

    @Override
    public void message() {
        super.message();
        System.out.println("И он везёт груз...");
    }

}
