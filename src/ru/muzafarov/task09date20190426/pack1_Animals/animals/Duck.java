package ru.muzafarov.task09date20190426.pack1_Animals.animals;

import ru.muzafarov.task09date20190426.pack0_Behavior.Flyable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Runnable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Swimmable;
import ru.muzafarov.task09date20190426.pack1_Animals.Animal;

public class Duck extends Animal implements Flyable, Runnable, Swimmable {

    public void getName() {

        System.out.println("УТКА: Привет! Я - Дональд Дак!");

    }

    public void fly() {

        System.out.println("Утка летит...");

    }

    public void run() {

        System.out.println("Утка бежит...");

    }

    public void swim() {

        System.out.println("Утка плывёт...");

    }

}
