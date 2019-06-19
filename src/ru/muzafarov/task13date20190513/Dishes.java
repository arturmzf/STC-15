package ru.muzafarov.task13date20190513;

public enum Dishes {

    BUCKWHEAT ("Гречка", true),
    RISE ("Рис", true),
    POTATO ("Картошка", true),
    OMELETTE ("Омлет", true),
    PASTA ("Макароны", true),
    SOUP ("Суп", true),
    LIVER ("Печёнка", false),
    CELERY ("Сельдерей", false),
    HOMINI ("Мамалыга", false);


    private String title;
    private boolean eatable;

    Dishes(String title, boolean eatable) {
        this.title = title;
        this.eatable = eatable;
    }

    public String getTitle() {
        return title;
    }

    public boolean getEatable() {
        return eatable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

}
