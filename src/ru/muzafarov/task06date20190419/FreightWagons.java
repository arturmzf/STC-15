package ru.muzafarov.task06date20190419;

public class FreightWagons extends Wagons {

    // Грузовые вагоны

    private int number; // Инвертарник
    public String type; // Хоппер, цисцерна, полувагон, рефрежиратор, платформа и др. ENUM!!!

    public FreightWagons(int number, String type) {
        this.number = number;
        this.type = type;

        Message();
    }

    @Override
    public void Message() {
        super.Message();
        System.out.println("И он везёт груз...");
    }

}
