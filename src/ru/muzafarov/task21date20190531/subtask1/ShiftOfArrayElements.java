package ru.muzafarov.task21date20190531.subtask1;

public class ShiftOfArrayElements {

    private int[][] array;

    public ShiftOfArrayElements(int[][] array) {
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

            for (int j = 0; j < (array[i].length); j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");

        }
    }

    public void toLeft() {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < (array[i].length - 1); j++) {

                array[i][j] = array[i][j+1];

            }

            array[i][array[i].length - 1] = 0;

        }

    }

    public void showResult() {

        System.out.println("Изменённый массивчик:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < (array[i].length); j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");

        }

    }

}
