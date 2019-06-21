package ru.muzafarov.task14date20190515.for_logging;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.io.FileNotFoundException;

public class forLoggingLog4j {

    private static final Logger logger = Logger.getLogger(forLoggingLog4j.class);

}



/*

package ru.stc;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.io.FileNotFoundException;

public class Log4jDemo {
    private static final Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) throws FileNotFoundException {
        logger.log(Priority.INFO, "Начало работы программы");
        try {
            doSome("значение");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        System.out.println("Пока!");
        logger.info("Программа завершена");
    }

    private static void doSome(String value) {
        logger.info("Вызван метод doSome с параметром <" + value + ">");
        logger.warn("сейчас будет ошибка");
        throw new RuntimeException("Какая-то ошибка");
    }
}






*/
