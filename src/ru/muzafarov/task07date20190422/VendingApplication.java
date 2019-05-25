package ru.muzafarov.task07date20190422;

import java.util.Scanner;

public class VendingApplication {

    public static void main(String[] args) {

        Drink[] drinks = new Drink[]{
                Drink.TEA_BLACK,
                Drink.TEA_GREEN,
                Drink.TEA_RED,
                Drink.COCA_COLA,
                Drink.PEPSI,
                Drink.FANTA,
                Drink.SPRITE,
                Drink.RED_BULL,
                Drink.KOLOKOLCHIK,
                Drink.VALERIAN
        };

        VendingMachine vm = new VendingMachine(drinks);

        vm.message(0, 0, 0, "");

        vm.addMoney();

        vm.showMenu();

        vm.giveMeADrink();

    }

}
