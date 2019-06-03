package ru.muzafarov.task09date20190426.pack1_Animals.animals;

import ru.muzafarov.task09date20190426.pack0_Behavior.Flyable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Runnable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Swimmable;
import ru.muzafarov.task09date20190426.pack1_Animals.Animal;

public class Hare extends Animal implements Runnable, Swimmable {

    public void getName() {

        System.out.println("ЗАЯЦ: Слышу-слышу...");

    }

    public void run() {

        System.out.println("Заяц бежит...");

    }

    public void swim() {

        System.out.println("Заяц плывёт...");

    }

}
