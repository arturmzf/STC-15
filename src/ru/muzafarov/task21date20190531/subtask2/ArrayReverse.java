package ru.muzafarov.task21date20190531.subtask2;

public class ArrayReverse {

    private int[][] array;
    private int[][] arrayOriginal;
    private int[] arrayTemporary;

    public ArrayReverse(int[][] array) {
        this.array = array;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public void arrayReverse() {

        arrayOriginal = array;

        for (int i = 0; i < array.length; i++) {

            arrayTemporary = array[i];

            for (int j = 0; j < (array[i].length - 1); j++) {

                array[i][j] = arrayTemporary[array[i].length - (j + 1)];

            }

        }

    }

    public void showResult() {

        System.out.println("Первоначальный массивчик:");

        for (int i = 0; i < arrayOriginal.length; i++) {

            for (int j = 0; j < (arrayOriginal[i].length); j++) {

                System.out.print(arrayOriginal[i][j] + " ");

            }

            System.out.println("");

        }

        System.out.println("\n\nИзменённый массивчик:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < (array[i].length); j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");

        }

    }

}
