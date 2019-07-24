/**
 * Занятие № 18 [от 24.05.2019 (Пт)]
 * Темы:
 * - Потоки символов
 * - Reader и Writer
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task18date20190524;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task18App {

    private final static int BUFFER_SIZE = 1000;

    public static void main(String[] args) {

        // Можно было сделать Enum, но ради этой ерунды я решил ограничиться двумерным массивом
        String[][] encodings = new String[][] {{"UTF-8", "utf-8"}, {"Windows-1251", "windows-1251"}, {"KOI8", "koi8"}};
        System.out.println("Выберите необходимую кодировку, введите её номер и нажмите ВВОД:");
        int i = 1;

        for (String[] encoding : encodings) {

            System.out.println(i + " - " + encoding[0]);
            i++;

        }

        Scanner scanner = new Scanner(System.in);
        int encodingNumber = scanner.nextInt();

        try (final FileInputStream    fileInputStream    = new FileInputStream("src/ru/muzafarov/task18date20190524/files/input.txt");
             final InputStreamReader  inputStreamReader  = new InputStreamReader(fileInputStream);
             final FileOutputStream   fileOutputStream   = new FileOutputStream("src/ru/muzafarov/task18date20190524/files/" + encodings[encodingNumber - 1][0] + "Output.txt");
             final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, encodings[encodingNumber - 1][1])) {

            final char[] buffer = new char[BUFFER_SIZE];
            int readed;

            while ((readed = inputStreamReader.read(buffer, 0, BUFFER_SIZE)) > 0) {
                outputStreamWriter.write(buffer, 0, readed);
            }

            System.out.println("Программа успешно завершила свою работу...");
        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
