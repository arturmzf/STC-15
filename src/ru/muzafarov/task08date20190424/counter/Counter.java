package ru.muzafarov.task08date20190424.counter;

public class Counter {

    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public Counter() {
        System.out.println("Создан новый объект класса Counter...");
        this.counter++;
    }
}
