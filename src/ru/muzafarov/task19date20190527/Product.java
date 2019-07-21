/**
 * Занятие № 19 [от 27.05.2019 (Пн)]
 * Темы:
 * - Кодировки
 * - Открытие/Закрытие потоков
 * - Try-Catch-With-Resource
 *
 * Музафаров Артур Ринатович
 */

package ru.muzafarov.task19date20190527;

public class Product {

    private String title;
    private double price;
    private boolean isAmountInt;
    private double amountDouble;
    private int amountInt;
    private double resultPrice;

    public Product() {
    }

    public Product(String title, double price, boolean isAmountInt, double amountDouble, int amountInt, double resultPrice) {
        this.title = title;
        this.price = price;
        this.isAmountInt = isAmountInt;
        this.amountDouble = amountDouble;
        this.amountInt = amountInt;
        this.resultPrice = resultPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsAmountInt() {
        return isAmountInt;
    }

    public void setIsAmountInt(boolean isAmountInt) {
        this.isAmountInt = isAmountInt;
    }

    public double getAmountDouble() {
        return amountDouble;
    }

    public void setAmountDouble(double amountDouble) {
        this.amountDouble = amountDouble;
    }

    public int getAmountInt() {
        return amountInt;
    }

    public void setAmountInt(int amountInt) {
        this.amountInt = amountInt;
    }

    public double getResultPrice() {
        return resultPrice;
    }

    public void setResultPrice(double resultPrice) {
        this.resultPrice = resultPrice;
    }
}
