/**
 * Занятие № 17 [от 22.05.2019 (Ср)]
 * Темы:
 * - Потоки-обёртки
 * - Сериализация объектов
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task17date20190522;

import java.util.*;

public class Task17App {

    public static void main(String[] args) {

        Library library = null;

        Scanner keyboard1 = new Scanner(System.in);

        System.out.println("Please, enter the number of the Library (between 1 and 3) and press ENTER-key:");
        int libraryNumber = keyboard1.nextInt();

        //TODO: try-catch...

        while((libraryNumber != 1) && (libraryNumber != 2) && (libraryNumber != 3)) {

            System.out.println("You entered the wrong number! Please, retry and press ENTER-key:");
            libraryNumber = keyboard1.nextInt();

        }

        switch(libraryNumber) {

            case 1:
                library = Library.LIB1;
                break;

            case 2:
                library = Library.LIB2;
                break;

            case 3:
                library = Library.LIB3;
                break;

            default:
                System.out.println("Unknown error...");
                System.out.println("STOP!");
                break;

        }

        System.out.println("Your choice is Library # " + library.getLibraryNumber() + "...");
        System.out.println("Library: " + library.getLibraryTitle());
        System.out.println("Address of Library: " + library.getLibraryAddress());
        System.out.println();

        String answer = "";
        System.out.println("Would You Add Any Book to the Library # " + library.getLibraryNumber() +
                                "? Y(y) - yes, N(n) - no.");
        Scanner keyboard2 = new Scanner(System.in);
        answer = keyboard2.nextLine().toLowerCase();

        while(answer.equals("y")) {

            library.addBook();

            System.out.println("Would You Add Any Book to the Library # " + library.getLibraryNumber() +
                    "? Y(y) - yes, N(n) - no.");
            answer = keyboard2.nextLine().toLowerCase();

        }

    }

}
