package ru.muzafarov.task08date20190424.experimentsWithFinal;

// Не даёт наследоваться от FinalClass
// public class NonFinalClass extends FinalClass {

public class NonFinalClass {

    private final int a = 0;
    private int b = 0;

    // Конструктор
    public NonFinalClass(int a, int b) {
        // Не даёт изменять переменную a с помощью конструктора
        // this.a = a;
        System.out.println("NonFinalClass:");
        System.out.println(a + " " + b);
        System.out.println();
    }

    // Не даёт изменять переменную a с помощью сеттера
    /*public void setA(int a) {
        this.a = a;
    }*/

    // Да и вообще не даёт изменять её в принципе...
    // a = 3;

    public void setB(int b) {
        this.b = b;
    }

    // Попробуем переопределить этот метод в классе ForOverride
    public final void message() {
        System.out.println();
        System.out.println("This is NonFinalClass' method");
    }

}
