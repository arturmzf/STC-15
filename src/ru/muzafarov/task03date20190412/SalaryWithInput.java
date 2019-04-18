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
Программа, которая считает зарплату "на руки".
На вход программе передается величина зарплаты и НДФЛ в процентах.
На выходе печатается зарплата за вычетом НДФЛ.
 */

import java.util.Scanner;

public class SalaryWithInput {

    public static void main(String[] args) {

        /*
        Вход: величина зарплаты и НДФЛ в процентах
         */
        Scanner scannerFullSalary = new Scanner(System.in);
        System.out.println("Пожалуйста, введите величину Вашей зароботной платы и нажмине ENTER:");
        int fullSalary = scannerFullSalary.nextInt();
        //int fullSalary = 500000;
        Scanner scannerNDFL = new Scanner(System.in);
        System.out.println("Пожалуйста, введите величину НДФЛ в Вашем регионе в процентах и нажмине ENTER:");
        int ndfl = scannerNDFL.nextInt();

        /*
        Объявление и инициализация оставшейся переменной № 3 - итоговой зарплаты за вычетом НДФЛ
        */
        //int ndfl = 13;
        double totalSalary;

        totalSalary = fullSalary / 100 * (100 - ndfl);

        // Вывод результата на экран
        System.out.print("Увы, на руки Вы получите лишь: ");
        System.out.print(totalSalary);
        System.out.println(" рублей.");
        System.out.println("Денег нет, но Вы держитесь!");

    }
}
