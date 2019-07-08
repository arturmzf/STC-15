package ru.muzafarov.task13date20190513;

import java.util.Scanner;
import ru.muzafarov.task13date20190513.exceptions.EructationException;

public class Child {

    private Dishes[] dishes;
    private int numberOfDish;

    public Child(Dishes[] dishes) {
        this.dishes = dishes;
    }

    public void speakBeginning() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Мамочка, что мы будем сегодня кушать?");

        for(int i = 1; i <= this.dishes.length; i++) {
            System.out.println(i + " - " + this.dishes[i - 1].getTitle());
        }

        this.numberOfDish = scanner.nextInt();

    }

    public void doEat() throws EructationException /* throws EructationException */ {

        // Проверка
        // System.out.println(this.dishes[this.numberOfDish - 1].getTitle());

        if (!this.dishes[this.numberOfDish - 1].getEatable()) {
            throw new EructationException();
        }

        System.out.println("Ура! Наше сегодняшнее блюдо: " + this.dishes[this.numberOfDish - 1].getTitle());

        /*try {

            if (!this.dishes[this.numberOfDish - 1].getEatable()) {
                throw new EructationException();
            }

            System.out.println("Ура! Наше сегодняшнее блюдо: " + this.dishes[this.numberOfDish - 1].getTitle());

        } catch(EructationException e) {
            System.out.println("Ребёнок, конечно, скажет спасибо... Но мы-то прекрасно понимаем...");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный номер!");
        } finally {
            System.out.println("Большое спасибо! Было очень вкусно!");
        }*/

    }

}
