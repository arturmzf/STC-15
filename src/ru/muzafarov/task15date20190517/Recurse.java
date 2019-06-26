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

    public static void recurse(int offset, String dirChild) {

        File mainDir = new File ("src/ru/muzafarov/task15date20190517/recurse"
                + File.separator + dirChild);

        File[] elements = mainDir.listFiles();

        for(File element : elements) {

            if(element.isFile()) {

                for(int i = 0; i <= offset; i++) {
                    System.out.print("\t");
                }

                System.out.println(element.getName());

            } else {

                for(int i = 0; i <= offset; i++) {
                    System.out.print("\t");
                }

                System.out.println(element.getName());

                recurse(offset++, element.getName());

            }

        }




        /*dir.mkdir();
            File dirEnter = new File ();
            dirEnter.recurse(); // МЕТОД СТАТИЧЕСКИЙ!
        if(dir.isDirectory()) {

        } else {
            recurse();
        }*/

    }

}
