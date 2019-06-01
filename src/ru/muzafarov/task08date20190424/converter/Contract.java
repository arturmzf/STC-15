package ru.muzafarov.task08date20190424.converter;

public class Contract {

    private int number;
    private String date;
    private String[] production;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getProduction() {
        return production;
    }

    public void setProduction(String[] production) {
        this.production = production;
    }

    public Contract(int number, String date, String[] production) {
        this.number = number;
        this.date = date;
        this.production = production;
    }
}
