/**
 * Занятие № 4 [от 15.04.2019 (Пн)]
 * Темы:
 * - Управляющие конструкции: условные операторы и циклы.
 * - Условия If и While.
 * - Циклы For и Foreach.
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task04date20190415;

/*
Программа, описывающая введённое число.
Отрицательное оно, положительное или равно нулю?
Чётное оно или нет?
 */

import java.util.Scanner;

public class WhatIsNumber {

    public static void main(String[] args) {

        String oddEven;
        String positiveNegative;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число и нажмите ENTER:");
        int a = scanner.nextInt();

        if (a > 0) {
            positiveNegative = "положительным";
        } else if (a < 0) {
            positiveNegative = "отрицательным";
        } else {
            positiveNegative = "равным нулю";
        }

        switch (a%2) {
            case 0:
                oddEven = "чётным";
                break;
            case 1:
                oddEven = "нечётным";
                break;
            default:
                oddEven = "непонятно каким";
                break;
        }

        System.out.println("Введённое Вами число " + a +
                " является " + positiveNegative +
                " и " + oddEven + ".");
    }

}
