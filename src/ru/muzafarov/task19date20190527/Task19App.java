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

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Task19App {

    public static void main(String[] args) {

        Product[] products = new Product[0];
        boolean isAmount = true; //FLAG
        String title = "";
        boolean isAmountInt = true; //FLAG
        int amountInt = 0;
        double amountDouble = 0;
        double price = 0;
        //Formatter outputFile;
        double fullPrice = 0;
        String resultPrice = "";

        try (FileReader fileInputData = new FileReader("src/ru/muzafarov/task19date20190527/files/productsInput.txt");
            Scanner scanner = new Scanner(fileInputData)) {

            while (scanner.hasNext()) {

                if (scanner.hasNextLine() && !scanner.hasNextDouble()) {

                    title = scanner.nextLine();

                } else if (scanner.hasNextInt() && isAmount) {

                    isAmountInt = true;
                    amountInt = scanner.nextInt();
                    amountDouble = 0;
                    isAmount = false;

                } else if (scanner.hasNextDouble() && isAmount) {

                    isAmountInt = false;
                    amountInt = 0;
                    amountDouble = scanner.nextDouble();
                    isAmount = false;

                } else if (scanner.hasNextDouble() && !isAmount) {

                    price = scanner.nextDouble();

                    Product product = new Product(title, price, isAmountInt, amountDouble, amountInt, (amountDouble * price) + (amountInt * price));
                    Product[] newProducts = new Product[products.length + 1];
                    System.arraycopy(products, 0, newProducts, 0, products.length);
                    newProducts[products.length] = product;
                    products = newProducts;
                    newProducts = null;
                    isAmount = true;

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileOutputStream fos = new FileOutputStream("src/ru/muzafarov/task19date20190527/files/productsOutput.txt");
            PrintStream printStream = new PrintStream(fos)) {

            printStream.printf("%-17s %6s %8s %13s%n", "Наименование", "Цена", "Кол-во", "Стоимость ");

            for (int i = 1; i <= 47; i++) {

                printStream.print("=");

            }

            printStream.println("");

            for(Product product : products) {

                resultPrice = "=" + String.format("%.2f", product.getResultPrice());

                if (product.getIsAmountInt()) {

                    printStream.printf("%-17s %6.2f x %6d %13s%n", product.getTitle(), product.getPrice(), product.getAmountInt(), resultPrice);
                    fullPrice += product.getResultPrice();

                } else {

                    printStream.printf("%-17s %6.2f x %6.3f %13s%n", product.getTitle(), product.getPrice(), product.getAmountDouble(), resultPrice);
                    fullPrice += product.getResultPrice();

                }

            }

            for (int i = 1; i <= 47; i++) {

                printStream.print("=");

            }

            printStream.println("");

            printStream.printf("%-33s %13.2f%n", "Итого:", fullPrice);

            System.out.println("Запись в файл произведена!");

        } catch(IOException e) {

            System.out.println(e.getMessage());

        }

        /*outputFile = new Formatter("src/ru/muzafarov/task19date20190527/files/productsOutput.txt");
        outputFile.format("Hello!");*/


        /*for(Product product : products) {

            outputFile.format("%-15s %04.2f %04.2f %04.2f %n %n", product.getTitle(), product.getAmount(), product.getPrice(), product.getResultPrice());

        }*/


        /*try(FileWriter fw = new FileWriter("src/ru/muzafarov/task19date20190527/files/productsOutput.txt")) {

            for(Product product : products) {

                fw.write("%-15s %04.2f %04.2f %04.2f %n %n", product.getTitle(), product.getAmount(), product.getPrice(), product.getResultPrice());

            }

        } catch(IOException e) {

            System.out.println(e.getMessage());

        }*/

        // FileWriter("src/ru/muzafarov/task19date20190527/files/productsOutput.txt");

        /*for(Product product : products) {

            // CHECK
            System.out.printf("%-15s %04.2f %04.2f %04.2f %n %n", product.getTitle(), product.getAmount(), product.getPrice(), product.getResultPrice());

            *//*System.out.println(product.getTitle());
            System.out.println(product.getAmount());
            System.out.println(product.getPrice());
            System.out.println(product.getResultPrice());
            System.out.println();*//*

        }*/
    }
}
