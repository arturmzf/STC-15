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
import java.io.IOException;
import java.nio.file.Files;

public class Recurse {

    private int offset = 0;
    //private String[] elements;

    public static void recurse(int offset, String dirPath) {

        File mainDir = new File (dirPath);

        File[] elements = mainDir.listFiles();

        for(File element : elements) {

            if(element.isFile()) {

                for(int i = 0; i < offset; i++) {
                    System.out.print(" ");
                }

                System.out.println(element.getName());

            } else {

                for(int i = 0; i < offset; i++) {
                    System.out.print(" ");
                }

                System.out.println(element.getName());

                try {
                    recurse(++offset, element.getCanonicalPath());
                } catch (IOException e) {
                    System.out.println("Произошла ошибка! Возможно, проблемы с носителем...");
                    System.out.println("Более подробная информация:");
                    System.out.println(e);
                }




            }

        }

    }

}
