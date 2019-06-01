package ru.muzafarov.task08date20190424.experimentsWithFinal;

public class ForOverride extends NonFinalClass {

    // Не понял, зачем он потребовал создание этого конструктора...
    public ForOverride(int a, int b) {
        super(a, b);
        System.out.println("ForOverride:");
        System.out.println(a + " " + b);
        System.out.println();
    }

    // Не даёт переопределить финальный метод message()
    /*@Override
    public void message() {
        System.out.println("This is For Override's method");
    }*/

}
