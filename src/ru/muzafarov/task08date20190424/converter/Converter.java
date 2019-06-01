package ru.muzafarov.task08date20190424.converter;

public class Converter {

    public static Act convert(Contract contract) {
        Act act = new Act(contract.getNumber(), contract.getDate(), contract.getProduction());
        return act;
    }

    @Override
    public String toString() {

    }

}
