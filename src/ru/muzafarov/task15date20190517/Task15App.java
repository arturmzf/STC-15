/**
 * Занятие № 15 [от 17.05.2019 (Пт)]
 * Темы:
 * - Доступ к файловой системе
 * - File и Path
 * - Рекурсия
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task15date20190517;

public class Task15App {

    public static void main(String[] args) {

        System.out.println("The 1st Part");

        PlayWithFiles.playWithFiles();
        // PlayWithFiles.playWithFiles();

        System.out.println();
        System.out.println("The 2nd Part");

        Recurse.recurse(0, "src/ru/muzafarov/task15date20190517/recurse");

    }

}
