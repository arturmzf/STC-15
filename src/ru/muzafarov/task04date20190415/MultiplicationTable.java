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

// Программа вывода на экран таблицы умножения.

public class MultiplicationTable {

    public static void main(String[] args) {

        for (byte k = 0; k < 44; k++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println("***** Т-А-Б-Л-И-Ц-А  У-М-Н-О-Ж-Е-Н-И-Я *****");

        for (byte k = 0; k < 44; k++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println();

        /*
        Ругается на дублирование кода. Наверное, это не критично...
         */
        for (byte k = 1; k < 2; k++) {
            System.out.print(" 0 * ");
            for (byte l = 1; l <= 10; l++) {
                if (k*l < 10) {
                    System.out.print("  " + k*l + " ");
                } else if (k*l < 100) {
                    System.out.print(" " + k*l + " ");
                } else {
                    System.out.print(k*l + " ");
                }
            }

            System.out.println();
        }

        for (byte k = 0; k < 44; k++) {
            System.out.print("*");
        }

        System.out.println();

        for (byte i = 1; i <= 10; i++) {
            if (i<10) {
                System.out.print(" " + i + " * ");
            } else {
                System.out.print(i + " * ");
            }
            for (byte j = 1; j <= 10; j++) {
                if (i*j < 10) {
                    System.out.print("  " + i*j + " ");
                } else if (i*j < 100) {
                    System.out.print(" " + i*j + " ");
                } else {
                    System.out.print(i*j + " ");
                }
            }

            System.out.println();
        }

    }

}
