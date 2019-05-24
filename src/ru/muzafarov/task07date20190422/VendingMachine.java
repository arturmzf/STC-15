package ru.muzafarov.task07date20190422;

public class VendingMachine {

    private Drink[] drinks;
    private int money;

    public VendingMachine(int money) {
        this.money = money;
    }

    public VendingMachine(Drink[] drinks) {
        this.drinks = drinks;
    }

    public VendingMachine(Drink[] drinks, int money) {
        this.drinks = drinks;
        this.money = money;
    }

    public void showMenu() {
        System.out.println("Сработал метод showMenu()");
        System.out.println("У вас на счету " + this.money + " рублей.");
    }

    /*public void addMoney(int money) {
        this.money = money;
    }*/

    //addMoney() - зачисляет деньги на счёт пользователя

    //giveMeADrink(int key)

}
