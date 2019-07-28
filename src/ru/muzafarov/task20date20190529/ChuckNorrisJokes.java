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

import java.util.Arrays;

public class ChuckNorrisJokes {

    private int id;
    private String type;
    private String joke;
    private String[] categories;

    public ChuckNorrisJokes() {
    }

    public ChuckNorrisJokes(int id, String type, String joke, String[] categories) {
        this.id = id;
        this.type = type;
        this.joke = joke;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "ChuckNorrisJokes{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", joke='" + joke + '\'' +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }
}
