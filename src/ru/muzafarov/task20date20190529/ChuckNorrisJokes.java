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

    private String type;
    private Value value;

    public ChuckNorrisJokes() {
    }

    public ChuckNorrisJokes(String type, Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
