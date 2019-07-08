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
import java.io.*;

public enum Library {

    LIB1 (1, "Центральная городская библиотека", "ул. Ленина, д. 40"),
    LIB2 (2, "Библиотека им. Ф.М.Достоевского", "ул. Путина, д. 17"),
    LIB3 (3, "Национальная библиотека", "ул. Энтузиастов, д. 3");

    private int libraryNumber;
    private String libraryTitle;
    private String libraryAddress;
    private Book[] books = new Book[100];

    private static int bookID = 1;

    Library(int libraryNumber, String libraryTitle, String libraryAddress) {
        this.libraryNumber = libraryNumber;
        this.libraryTitle = libraryTitle;
        this.libraryAddress = libraryAddress;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getLibraryTitle() {
        return libraryTitle;
    }

    public void setLibraryTitle(String libraryTitle) {
        this.libraryTitle = libraryTitle;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public static int getBookID() {
        return bookID;
    }

    public static void setBookID(int bookID) {
        Library.bookID = bookID;
    }

    public void addBook() {

        int id = Library.bookID++;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, enter the author of the book and press ENTER-key:");
        String author = keyboard.nextLine();

        System.out.println("Please, enter the title of the book and press ENTER-key:");
        String title = keyboard.nextLine();

        System.out.println("When the book was published? Answer and do not forget to press ENTER-key!");
        int year = keyboard.nextInt();

        System.out.println("Which rack is the book in? Answer and do not forget to press ENTER-key!");
        int rack = keyboard.nextInt();

        System.out.println("Which level is the book on? Answer and do not forget to press ENTER-key!");
        int level = keyboard.nextInt();

        Book book = new Book(id, author, title, year, rack, level);

        this.books[id] = book;

    }

    public void saveBooks() {

        try (OutputStream os = new FileOutputStream("src/ru/muzafarov/task17date20190522/files/booksBase.bin");
            ObjectOutputStream fout = new ObjectOutputStream(os))
        {

            for (Book book : books) {
                fout.writeObject(book);
            }

        } catch (IOException e) {

            // ВНИМАНИЕ!
            System.out.println("Ошибка при работе с потоком...");

        }

    }

    public void showBooks() {

        try (InputStream is = new FileInputStream("src/ru/muzafarov/task17date20190522/files/booksBase.bin");
             ObjectInputStream fin = new ObjectInputStream(is))
        {
            Book book;
            // Чего за AVAILABLE ещё?
            while (is.available() > 0) {
                book = (Book) fin.readObject();
                System.out.println(book);
            }

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

        }

        /*for (Book book : books) {

            System.out.println(book.toString());

        }*/

    }

}
