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

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;

public class PlayWithFiles {

    public static void playWithFiles() {

        File myFile = new File("src/ru/muzafarov/task15date20190517/play_with_files", "myFile.txt");

        // Создание файла
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

        // Переименование файла
        File myNewFile = new File("src/ru/muzafarov/task15date20190517/play_with_files/myNewFile.txt");
        if (myFile.renameTo(myNewFile)) {
            System.out.println("Файл успешно переименован!");
        } else {
            System.out.println("Файл не переименован...");
        }

        System.out.println();

        // Копирование файла
        try {
            Files.copy(myNewFile.toPath(), myFile.toPath());
            System.out.println("Файл успешно скопирован!");
        } catch(IOException e) {
            System.out.println("Не удалось скопировать файл...");
            System.out.println(e);
        }

        System.out.println();

        // Удаление файла
        if (myNewFile.delete()) {
            System.out.println("Файл успешно удалён!");
        } else {
            System.out.println("Файл не удалён...");
        }

    }

}
