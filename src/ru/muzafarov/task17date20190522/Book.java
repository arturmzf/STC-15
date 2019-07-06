/**
 * Занятие № 17 [от 22.05.2019 (Ср)]
 * Темы:
 * - Потоки-обёртки
 * - Сериализация объектов
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task17date20190522;

public class Book {

    // Номер или ИД
    private int id;
    // Автор
    private String author;
    // Наименование
    private String title;
    // Год издания
    private int year;
    // Стеллаж и полка (уровень)
    private int[] rackLevel = new int[2];

    public Book(int id, String author, String title, int year, int rack, int level) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.rackLevel[0] = rack;
        this.rackLevel[1] = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRack() {
        return rackLevel[0];
    }

    public void setRack(int rack) {
        this.rackLevel[0] = rack;
    }

    public int getLevel() {
        return rackLevel[1];
    }

    public void setLevel(int level) {
        this.rackLevel[1] = level;
    }

}
