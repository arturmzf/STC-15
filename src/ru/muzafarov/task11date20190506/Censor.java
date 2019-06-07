package ru.muzafarov.task11date20190506;

public class Censor {

    private String oldStringData;
    private String newStringData;
    private String oldCombination;
    private String newCombination;

    public String getNewStringData() {
        return newStringData;
    }

    public Censor(String oldStringData, String oldCombination, String newCombination) {
        this.oldStringData = oldStringData;
        this.oldCombination = oldCombination;
        this.newCombination = newCombination;

        replacing(this.oldStringData);
    }

    public void replacing(String oldStringData) {

        this.newStringData = oldStringData.replaceAll(this.oldCombination, this.newCombination);

    }

    /*
    indexOf()
    Если вообще не встретим такую комбинацию,
    получим -1 и сообщим об этом пользователю...
     */

}
