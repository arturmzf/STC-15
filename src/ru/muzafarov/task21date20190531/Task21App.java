package ru.muzafarov.task21date20190531;

import ru.muzafarov.task21date20190531.subtask1.ShiftOfArrayElements;
import ru.muzafarov.task21date20190531.subtask2.ArrayReverse;

public class Task21App {

    public static void main(String[] args) {

        ShiftOfArrayElements soat = new ShiftOfArrayElements(new int[][] {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}});
        ArrayReverse ar = new ArrayReverse(new int[][] {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}});

        soat.showOriginalArray();
        soat.toLeft();
        soat.showResult();

        System.out.println("");
        System.out.println("");

        ar.showOriginalArray();
        ar.arrayReverse();
        ar.showResult();

    }

}
