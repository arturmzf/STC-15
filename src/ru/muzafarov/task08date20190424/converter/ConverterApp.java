package ru.muzafarov.task08date20190424.converter;

public class ConverterApp {

    public static void main(String[] args) {

        Contract contract1 = new Contract(174, "31.05.2019",
                new String[] {"product1", "product2", "product3"});
        Contract contract2 = new Contract(175, "01.06.2019",
                new String[] {"product4", "product5", "product6"});

        System.out.println(Converter.convert(contract1));
        System.out.println(Converter.convert(contract2));

    }

}
