package ru.muzafarov.task08date20190424.calculator;

import java.util.Scanner;
//import ru.muzafarov.task08date20190424.calculator.Actions;
//import static ru.muzafarov.task08date20190424.calculator.Actions.addition;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первый операнд и нажмите ENTER:");
        String operand1 = scanner1.nextLine();

        Scanner scannerOperator = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер действия, которое Вы хотите совершить:");
        System.out.println("1 - сложение;");
        System.out.println("2 - вычитание;");
        System.out.println("3 - умножение;");
        System.out.println("4 - деление;");
        System.out.println("5 - взятие процента от числа.");
        int operator = scannerOperator.nextInt();

        switch (operator) {
            case 1:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Пожалуйста, введите второй операнд и нажмите ENTER:");
                String operand2 = scanner2.nextLine();
                //System.out.println("Результат операции: " + Actions.addition(operand1, operand2));
                break;
            case 2:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Пожалуйста, введите второй операнд и нажмите ENTER:");
                String operand3 = scanner3.nextLine();
                //System.out.println("Результат операции: " + Actions.subtraction(operand1, operand3));
                break;
            case 3:
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Пожалуйста, введите второй операнд и нажмите ENTER:");
                String operand4 = scanner4.nextLine();
                //System.out.println("Результат операции: " + Actions.multiplication(operand1, operand4));
                break;
            case 4:
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("Пожалуйста, введите второй операнд и нажмите ENTER:");
                String operand5 = scanner5.nextLine();
                //System.out.println("Результат операции: " + Actions.division(operand1, operand5));
                break;
            case 5:
                Scanner scanner6 = new Scanner(System.in);
                System.out.println("Пожалуйста, введите количество процентов и нажмите ENTER:");
                int operand6 = scanner6.nextInt();
                //System.out.println("Результат операции: " + Actions.percent(operand1, operand6));
                break;
            default:
                System.out.println("Вы что-то не то ввели, увы...");
                break;
        }

    }

}
