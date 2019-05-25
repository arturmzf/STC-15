package ru.muzafarov.task07date20190422;

import java.util.Scanner;

public class VendingMachine {

    private Drink[] drinks;
    private int money;
    private int key;

    public VendingMachine(Drink[] drinks) {
        this.drinks = drinks;
    }

    public void message(int flag, int money, int price, String title) {

        switch (flag) {
            case 0:
                System.out.println("Здравствуйте! Вставьте купюру в купюроприёмник и нажмите ENTER:");
                break;
            case 1:
                System.out.println("Получите Ваш напиток: " + title + "!");
                System.out.println("Спасибо за покупку!");
                if ((money - price) != 0) {
                    System.out.println("У Вас на счету осталось: " + (money - price) + " рублей.\n" +
                            "На Вам мы их, конечно же, не вернём!");
                }
                break;
            case 2:
                System.out.println("У Вас недостаточно средств для покупки " +
                        "данного напитка!\n" +
                        "На Вашем счету: " + money + " рублей.\n" +
                        "Цена напитка: " + price + " рублей.\n" +
                        "Для совершения операции Вам необходимо ещё " + (price - money) + " рублей.\n" +
                        "Пожалуйста, вставьте купюру в купюроприёмник " +
                        "и нажмите ENTER:");
            default:
                System.out.print("");
                break;
        }

    }

    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        this.money += scanner.nextInt();
    }

    public void showMenu() {
        System.out.println();
        System.out.println("У Вас на счету " + this.money + " рублей.\n");
        System.out.println("Пожалуйста, выберите напиток из списка ниже:\n");
        for(int i=0; i<this.drinks.length; i++) {
            System.out.format("%02d - ", (i+1));
            System.out.print(drinks[i].getDrinkTitle() + " - цена: ");
            System.out.println(drinks[i].getDrinkPrice() + " рублей.");
        }
        System.out.println();
        System.out.println("Нажмите необходимую клавишу:");
        Scanner scanner = new Scanner(System.in);
        this.key = (scanner.nextInt() - 1);
        while ((this.key < 0) || (this.key >= (drinks.length))) {
            System.out.println("Вы ввели неверное значение! Попробуйте ещё раз:");
            Scanner scanner1 = new Scanner(System.in);
            this.key = (scanner1.nextInt() - 1);
        }
    }

    public void giveMeADrink() {

        while(this.money < drinks[this.key].getDrinkPrice()) {
            message(2, this.money, drinks[this.key].getDrinkPrice(), "");
            addMoney();
        }

        message(1, this.money, drinks[key].getDrinkPrice(), drinks[key].getDrinkTitle());

    }

}
