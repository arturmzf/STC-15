/**
 * Занятие № 15 [от 17.05.2019 (Пт)]
 * Темы:
 * - Доступ к файловой системе.
 * - File и Path
 * - Рекурсия
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task15date20190517;

import java.io.File;
import java.nio.*;
import java.io.IOException;

public class PlayWithFiles {

    public static void playWithFiles() {

        File myFile = new File("/media/arturmzf/General/STC-15/src/ru/muzafarov/task15date20190517/play_with_files", "myFile.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("Файл успешно создан!");
            } else {
                System.out.println("Такой файл уже существует...");
            }
        } catch(IOException e) {
            System.out.println("Не удалось создать файл...");
            System.out.println(e);

        }

        System.out.println();

        if (myFile.renameTo(new File("/media/arturmzf/General/STC-15/src/ru/muzafarov/task15date20190517/play_with_files/myNewFile.txt"))) {
            System.out.println("Файл успешно переименован!");
        } else {
            System.out.println("Файл не переименован...");
        }

        //myFile.copy();

        System.out.println();

        if (myFile.delete()) {
            System.out.println("Файл успешно удалён!");
        } else {
            System.out.println("Файл не удалён...");
        }

    }

}
