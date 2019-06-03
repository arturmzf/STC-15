package ru.muzafarov.task09date20190426.pack1_Animals;

import ru.muzafarov.task09date20190426.pack1_Animals.animals.Hare;
import ru.muzafarov.task09date20190426.pack1_Animals.animals.Wolf;

public class AnimalApp {

    public static void main(String[] args) {

        // В чём разница, если создавать объект так:
        // Wolf wolfy = new Wolf();
        // или так:
        // Animal wolfy = new Wolf(); ?
        // Answer: Lesson 9 (00:24:37)
        Animal wolfy = new Wolf();
        Animal bunny = new Hare();

        wolfy.getName();
        bunny.getName();

    }

}
