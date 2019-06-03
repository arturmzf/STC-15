package ru.muzafarov.task09date20190426.pack2_Humans;

import ru.muzafarov.task09date20190426.pack2_Humans.humans.Man;
import ru.muzafarov.task09date20190426.pack2_Humans.humans.Woman;

public class HumanApp {

    public static void main(String[] args) {

//      Human man = new Man();
//      Human woman = new Woman();

        Man man = new Man();
        Woman woman = new Woman();

        man.run();
        man.swim();
        System.out.println(man.getSex());

        woman.run();
        woman.swim();
        System.out.println(woman.getSex());

    }

}
