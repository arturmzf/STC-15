package ru.muzafarov.task21date20190531.subtask2;

public class ArrayReverse {

    private int[][] array;

    public ArrayReverse(int[][] array) {
        this.array = array;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public void showOriginalArray() {

        System.out.println("Первоначальный массивчик:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");

        }
    }

    public void arrayReverse() {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                int tmp = array[i][j];
                array[i][j] = array[i][array[i].length - (j + 1)];
                array[i][array[i].length - (j + 1)] = tmp;

            }

        }

    }

    public void showResult() {

        System.out.println("\n\nИзменённый массивчик:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");

        }

    }

}
