package ru.muzafarov.task21date20190531.subtask2;

public class ArrayReverse {

    private int[][] array;
    boolean[] flags;

    public ArrayReverse(int[][] array) {
        this.array = array;
        // НЕ ОЧЕНЬ!!!
        flags = new boolean[array[0].length];
        for (int i=0; i < flags.length; i++) {
            flags[i] = true;
        }
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

    // TODO Исправить недочёты!!!
    public void arrayReverse() {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (this.flags[j]) {

                    int tmp = array[i][j];
                    array[i][j] = array[i][array[i].length - (j + 1)];
                    array[i][array[i].length - (j + 1)] = tmp;

                    this.flags[this.flags.length - (j + 1)] = false;

                }

            }

            for (int k=0; k<this.flags.length; k++) {
                this.flags[k] = true;
            }

        }

    }

    public void showResult() {

        System.out.println("Изменённый массивчик:");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println("");

        }

    }

}
