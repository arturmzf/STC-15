package ru.muzafarov.task13date20190513;

import java.util.Scanner;
import ru.muzafarov.task13date20190513.exceptions.EructationException;

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

        try {

            mySon.doEat();

        } catch(EructationException e) {
            System.out.println("Ребёнок, конечно, скажет спасибо... Но мы-то прекрасно понимаем...");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный номер!");
        } finally {
            System.out.println("Большое спасибо! Было очень вкусно!");
        }

    }

}
