package ru.muzafarov.task09date20190426.pack2_Humans.humans;

import ru.muzafarov.task09date20190426.pack2_Humans.Human;

public class Woman extends Human {

    private String sex = "woman";

    public void run() {

        System.out.println("Я - женщина, и я неплохо бегаю...");

    }

    public void swim() {

        System.out.println("Я - женщина, и я отлично бегаю...лучше, чем мужчина");

    }

    public String getSex() {

        return sex;

    }

    public Woman() {
    }

}
