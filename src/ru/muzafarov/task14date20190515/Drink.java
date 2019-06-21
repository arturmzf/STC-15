package ru.muzafarov.task14date20190515;

public enum Drink {

    TEA_BLACK("Чай чёрный", 30),
    TEA_GREEN("Чай зелёный", 35),
    TEA_RED("Каркаде", 40),
    COCA_COLA("Кока-Кола", 70),
    PEPSI("Пепси", 65),
    FANTA("Фанта", 65),
    SPRITE("Спрайт", 65),
    RED_BULL("Red Bull", 80),
    KOLOKOLCHIK("Колокольчик", 20),
    VALERIAN("Валерианы настойка", 25);

    private String drinkTitle;
    private int drinkPrice;

    public String getDrinkTitle() {
        return drinkTitle;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    Drink(String drinkTitle, int drinkPrice) {
        this.drinkTitle = drinkTitle;
        this.drinkPrice = drinkPrice;
    }
}
