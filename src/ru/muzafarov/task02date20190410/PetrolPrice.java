package ru.muzafarov.task02date20190410;

public class PetrolPrice {

    public static void main(String[] args) {

        /*
        Объявление переменных
        Переменная № 1 - количество литров бензина
        Переменная № 2 - цена за литр бензина
        Переменная № 3 - итоговая цена
         */
        int numberOfLiters;
        int pricePerLiter;
        int totalPrice;

        /*
        Инициализация переменных
        Можно было сделать при объявление переменных,
            но решил сделать так, чтобы строк было
            больше :)
        */
        numberOfLiters = 30;
        pricePerLiter = 45;
        totalPrice = 0;

        totalPrice = numberOfLiters * pricePerLiter;

        System.out.print("Итоговая цена: ");
        System.out.print(totalPrice);
        System.out.println(" рублей.");
        System.out.println("Спасибо за покупку!");

    }
}
