/**
 * Занятие № 20 [от 29.05.2019 (Ср)]
 * Темы:
 * - Сериализация
 * - Передача данных в формате XML
 * - Передача данных в формате JSON
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task20date20190529;

public class Value {

    private int id;
    private String joke;
    private String[] categories;

    public Value() {
    }

    public Value(int id, String joke, String[] categories) {
        this.id = id;
        this.joke = joke;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

}
