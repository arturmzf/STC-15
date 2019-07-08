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

        System.out.println("Alright! Your choice is Library # " + library.getLibraryNumber() + "...");
        System.out.println("Library: " + library.getLibraryTitle());
        System.out.println("Address of Library: " + library.getLibraryAddress());
        System.out.println();

        String answerWishToAdd = "";
        String answerWishToSee = "";
        String answerWishToSave = "";
        System.out.println("Would You Add Any Book to the Library # " + library.getLibraryNumber() +
                                "? Y(y)/ Д(д) - yes, N(n)/ Н(н) - no.");
        Scanner keyboard2 = new Scanner(System.in);
        answerWishToAdd = keyboard2.nextLine().toLowerCase();

        while(answerWishToAdd.equals("y") || answerWishToAdd.equals("д")) {

            library.addBook();

            System.out.println("Thank You! The Book is Added...");
            System.out.println("");
            System.out.println("Would You Add Any Book to the Library # " + library.getLibraryNumber() +
                    "? Y(y) - yes, N(n) - no.");
            answerWishToAdd = keyboard2.nextLine().toLowerCase();

        }

        System.out.println("Would You Save the List of Books of the Library # " + library.getLibraryNumber() +
                "? Y(y) - yes, N(n) - no.");

        Scanner keyboard3 = new Scanner(System.in);
        answerWishToSave = keyboard3.nextLine().toLowerCase();

        if(answerWishToSave.equals("y") || answerWishToSave.equals("д")) {

            library.saveBooks();

        }

        System.out.println("Would You See the List of Books of the Library # " + library.getLibraryNumber() +
                "? Y(y) - yes, N(n) - no.");

        Scanner keyboard4 = new Scanner(System.in);
        answerWishToSee = keyboard4.nextLine().toLowerCase();

        if(answerWishToSee.equals("y") || answerWishToSee.equals("д")) {

            library.showBooks();

        }

    }

}
