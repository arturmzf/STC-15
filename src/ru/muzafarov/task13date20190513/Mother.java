package ru.muzafarov.task13date20190513;

import java.util.Scanner;

public class Mother {

    /*private Dishes[] dishes = new Dishes[] {
        Dishes.BUCKWHEAT,
        Dishes.RISE,
        Dishes.POTATO,
        Dishes.OMELETTE,
        Dishes.PASTA,
        Dishes.SOUP,
        Dishes.LIVER,
        Dishes.CELERY,
        Dishes.HOMINI
    };*/

    public static void main(String[] args) {

        Dishes[] dishes = new Dishes[] {
            Dishes.BUCKWHEAT,
            Dishes.RISE,
            Dishes.POTATO,
            Dishes.OMELETTE,
            Dishes.PASTA,
            Dishes.SOUP,
            Dishes.LIVER,
            Dishes.CELERY,
            Dishes.HOMINI
        };

        Child mySon = new Child(dishes);

        mySon.speakBeginning();

        mySon.doEat();

    }

}
