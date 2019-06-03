package ru.muzafarov.task09date20190426.pack1_Animals.animals;

import ru.muzafarov.task09date20190426.pack0_Behavior.Flyable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Runnable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Swimmable;
import ru.muzafarov.task09date20190426.pack1_Animals.Animal;

public class Wolf extends Animal implements Runnable, Swimmable {

    public void getName() {

        System.out.println("ВОЛК: Заяц! ЗАЯЦ!!! Ты меня слышишь?!");

    }

    public void run() {

        System.out.println("Волк бежит...");

    }

    public void swim() {

        System.out.println("Волк плывёт...");

    }

}
