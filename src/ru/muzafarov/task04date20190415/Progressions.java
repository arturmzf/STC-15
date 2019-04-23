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
Программа вывода на экран
арифметической или геометрической прогрессии для N чисел.
 */

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;

public class Progressions {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Выберите, пожалуйста, с какой прогрессией Вы хотели бы поработать.\n" +
                "Для этого введите один из символов \"а\" или \"А\" на кириллице или латинице,\n" +
                "если Вам нужна арифметическая прогрессия,\n" +
                "либо введите один из символов \"г\", \"Г\", \"g\" или \"G\",\n" +
                "если Вам нужна геометрическая прогрессия.\n" +
                "Затем нажмите ENTER:");
        String kindOfProgression = scanner1.nextLine();



        kindOfProgression = kindOfProgression.toLowerCase();

        if (kindOfProgression.equals("а") | kindOfProgression.equals("a")) {
            arithmeticProgression();
        } else if (kindOfProgression.equals("г") | kindOfProgression.equals("g")) {
            geometricProgression();
        } else {
            System.out.println("Вы ввели некорректный символ! Разуйте глаза и повторите попытку!");
        }

    }

    public static void arithmeticProgression() {
        System.out.println("Вы выбрали арифметическую прогрессию...");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первый элемент арифметической прогрессии и нажмите ENTER:");
        int a1 = scanner2.nextInt();
        System.out.println("Пожалуйста, введите разность (может быть и отрицательной) арифметической прогрессии и нажмите ENTER:");
        int d = scanner2.nextInt();
        System.out.println("Пожалуйста, введите количество элементов арифметической прогрессии,");
        System.out.println("которое Вы хотите вывести, и нажмите ENTER:");
        int n = scanner2.nextInt();

        System.out.println();
        System.out.println("Элементы Вашей арифметической прогрессии:");
        for (int i = 0; i < n; i++) {
            int an = a1 + i*d;
            System.out.print(an + " ");
        }
        int sum = ((2*a1 + d*(n - 1))/2)*n;
        System.out.println();
        System.out.println("Сумма первых " + n + " элементов Вашей арифметической прогрессии: " + sum);
    }

    public static void geometricProgression() {
        /*
        Вонючие возведение в степень и метод pow() с его работой только с double...
        Пришлось воспользоваться конвертацией типов,
        что может повлечь за собой переполнение и последующие ошибки.
        Но я ничего лучше пока не придумал :(
         */
        System.out.println("Вы выбрали геометрическую прогрессию...");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первый элемент геометрической прогрессии и нажмите ENTER:");
        int b1 = scanner2.nextInt();
        System.out.println("Пожалуйста, введите знаменатель (может быть и отрицательным) геометрической прогрессии и нажмите ENTER:");
        double q = scanner2.nextDouble();
        System.out.println("Пожалуйста, введите количество элементов геометрической прогрессии,");
        System.out.println("которое Вы хотите вывести, и нажмите ENTER:");
        int n = scanner2.nextInt();

        System.out.println();
        System.out.println("Элементы Вашей геометрической прогрессии:");
        for (double i = 0; i < n; i++) {
            double qResult = pow(q, i);
            double bnDouble = b1*qResult;
            int bn = (int) bnDouble;
            System.out.print(bn + " ");
        }
        double qResult = pow(q, n);
        double sumDouble = (b1*(qResult - 1))/(q - 1);
        System.out.println();
        int sum = (int) sumDouble;
        System.out.println("Сумма первых " + n + " элементов Вашей геометрической прогрессии: " + sum);
    }
}
