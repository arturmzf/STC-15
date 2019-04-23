/**
 * Занятие № 3 [от 12.04.2019 (Пт)]
 * Темы:
 * - Базовый синтаксис.
 * - Примитивные типы.
 * - Преобразование типов.
 * - Массивы и строки.
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task03date20190412;

/*
Программа, которая считает стоимость бензина.
На вход программе передается количество литров.
На выходе печатается итоговая стоимость.
 */

import java.util.Scanner;

public class PetrolPriceWithInput {

    public static void main(String[] args) {

        /*
        Вход: ввод с клавиатуры количества литров бензина
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите количество залитых литров и нажмине ENTER:");
        int numberOfLiters = scanner.nextInt();
        //int numberOfLiters = 30;

        /*
        Объявление остальных переменных:
        - переменная № 2 - цена за литр бензина;
        - переменная № 3 - итоговая цена.
         */
        int pricePerLiter;
        int totalPrice;

        /*
        Инициализация переменных
        Можно было сделать при объявлении,
        но решил оставить так, чтобы строк было
        больше :)
         */
        pricePerLiter = 45;
        /*
        Как я понял, IDEA ругается, что я переменную "totalPrice" инициализировал нулём,
        а потом тут же присвоил ей значение выражения. Думаю, ничего страшного не случилось...
        Решил оставить. Или это плохой тон?
         */
        totalPrice = 0;

        totalPrice = numberOfLiters * pricePerLiter;

        // Вывод результата на экран
        System.out.print("Итоговая цена: ");
        System.out.print(totalPrice);
        System.out.println(" рублей.");
        System.out.println("Спасибо за покупку!");

    }
}
