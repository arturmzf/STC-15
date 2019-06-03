package ru.muzafarov.task09date20190426.pack2_Humans.humans;

import ru.muzafarov.task09date20190426.pack2_Humans.Human;

public class Man extends Human {

    private String sex = "man";

    public void run() {

        System.out.println("Я - мужчина, и я отлично бегаю...лучше, чем женщина!");

    }

    public void swim() {

        System.out.println("Я - мужчина, и я неплохо бегаю...");

    }

    public String getSex() {

        return sex;

    }

    public Man() {
    }

}
