package ru.muzafarov.task08date20190424.counter;

public class CounterApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 17; i++) {
            Counter counter = new Counter();
        }

        System.out.println();
        System.out.println("Всего созданных объектов:" + Counter.getCounter());

    }

}
