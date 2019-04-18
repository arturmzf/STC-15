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
Программа, которая конвертирует секунды в часы.
На вход программе передается количество секунд.
На выходе печатается количество часов.
 */

import java.util.Scanner;

public class SecondsToHoursWithInput {

    public static void main(String[] args) {

        /*
        Вход: количество секунд
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите количество секунд и нажмите ENTER:");
        int seconds = scanner.nextInt();
        //int seconds = 17400;

        /*
        Объявление оставшейся переменной
        Переменная № 2 - количество часов
         */
        int hours;

        // Воспользуемся целочисленным делением (в ТЗ ничего же не сказано на эту тему)
        hours = seconds / 3600;

        // Вывод результата на экран
        System.out.print("В ");
        System.out.print(seconds);
        System.out.print(" секундах ");
        System.out.print(hours);
        // Здесь хорошо бы заморочиться с окончаниями слов, но тогда нужны будут управляющие конструкции
        System.out.println(" целых часов.");

    }
}
