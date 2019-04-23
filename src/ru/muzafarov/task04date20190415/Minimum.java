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

// Программа для поиска минимального из двух чисел

import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {

        int min, max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первое число и нажмите ENTER:");
        int first = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число и нажмите ENTER:");
        int second = scanner.nextInt();
        System.out.println();

        if (first < second) {
            min = first;
            max = second;
        } else {
            min = second;
            max = first;
        }

        System.out.println("Из двух введённых Вами чисел " + first +
                " и " + second + " наименьшим является " + min +
                ", а наибольшим - " + max + ".");

    }

}
