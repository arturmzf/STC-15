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

public class Recurse {

    public static void recurse() {

        File dir = new File ("/media/arturmzf/General/STC-15/src/ru/muzafarov/task15date20190517/recurse/dir0.0");

        dir.mkdir();
            File dirEnter = new File ();
            dirEnter.recurse(); // МЕТОД СТАТИЧЕСКИЙ!
        if(dir.isDirectory()) {

        } else {
            recurse();
        }

    }

}
