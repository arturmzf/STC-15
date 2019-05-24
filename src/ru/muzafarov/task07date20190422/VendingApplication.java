package ru.muzafarov.task07date20190422;

import java.util.Scanner;

public class VendingApplication {

    public static void main(String[] args) {

        System.out.println("Здравствуйте! Вставьте купюру в купюроприёмник и нажмите ENTER:");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

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

        vm.showMenu();




        //addMoney(money);


        //VendingMachine vm = new VendingMachine(drinks[]);

        //vm.showMenu();

        //vm.addMoney(100);

        //vm.giveMeADrink(1);

    }

}
