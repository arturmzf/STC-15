package ru.muzafarov.task08date20190424.experimentsWithFinal;

public class MainClass {

    public static void main(String[] args) {

        NonFinalClass nFC = new NonFinalClass(15, 17);
        ForOverride fO = new ForOverride(30, 34);

        nFC.message();

    }

}
