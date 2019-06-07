package ru.muzafarov.task11date20190506;

import java.util.Scanner;

public class CensorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое предложение и нажмите ENTER:");
        // "Корабли лавировали-лавировали, да не выловировали..."
        String oldStringData = scanner.nextLine();
        System.out.println("Пожалуйста, введите выражение, которое Вы хотите заменить, и нажмите ENTER:");
        // "ров"
        String oldCombination = scanner.nextLine();
        System.out.println("На что ВЫ хотите его заменить? Нажмите ENTER:");
        // "РОВ"
        String newCombination = scanner.nextLine();

        Censor censor1 = new Censor(oldStringData, oldCombination, newCombination);
        System.out.println();
        System.out.println("Вот он, вывод:\n" + censor1.getNewStringData());

        /*
        indexOf()
        Если вообще не встретим такую комбинацию,
        получим -1 и сообщим об этом пользователю...
         */

    }

}
