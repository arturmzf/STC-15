package ru.muzafarov.task06date20190419;

public enum TypeOfLocomotive {

    // Грузовые локомотивы
    VL11("ВЛ11", "Электрическая тяга", "Грузовой локомотив"),     // electricity
    VL80("ВЛ80", "Электрическая тяга", "Грузовой локомотив"),     // electricity
    E5K("Э5К", "Электрическая тяга", "Грузовой локомотив"),      // electricity
    N2ES5("2ЭС5", "Электрическая тяга", "Грузовой локомотив"),    // electricity
    N2TE116U("ВЛ11", "Дизельная тяга", "Грузовой локомотив"), // diesel
    N2TE25A("ВЛ11", "Дизельная тяга", "Грузовой локомотив"),  // diesel
    N2TE70("ВЛ11", "Дизельная тяга", "Грузовой локомотив"),   // diesel
    // Пассажирские локомотивы
    VL60P("ВЛ11", "Электрическая тяга", "Пассажирский локомотив"),    // electricity
    CHS4T("ВЛ11", "Электрическая тяга", "Пассажирский локомотив"),    // electricity
    CHS7("ВЛ11", "Электрическая тяга", "Пассажирский локомотив"),     // electricity
    EP200("ВЛ11", "Электрическая тяга", "Пассажирский локомотив"),    // electricity
    TEP70BS("ВЛ11", "Дизельная тяга", "Пассажирский локомотив"),  // diesel
    TEP150("ВЛ11", "Дизельная тяга", "Пассажирский локомотив"),   // diesel
    TEP70U("ВЛ11", "Дизельная тяга", "Пассажирский локомотив"),   // diesel
    TEP33A("ВЛ11", "Дизельная тяга", "Пассажирский локомотив");   // diesel

    private String nameOfLocomotive;
    private String movablePower;
    private String typeOfLocomotive;

    public String getNameOfLocomotive() {
        return nameOfLocomotive;
    }

    public String getMovablePower() {
        return movablePower;
    }

    public String getTypeOfLocomotive() {
        return typeOfLocomotive;
    }

    TypeOfLocomotive(String nameOfLocomotive, String movablePower, String typeOfLocomotive) {
        this.nameOfLocomotive = nameOfLocomotive;
        this.movablePower = movablePower;
        this.typeOfLocomotive = typeOfLocomotive;
    }
}
