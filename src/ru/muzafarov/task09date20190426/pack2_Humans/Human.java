package ru.muzafarov.task09date20190426.pack2_Humans;

import ru.muzafarov.task09date20190426.pack0_Behavior.Runnable;
import ru.muzafarov.task09date20190426.pack0_Behavior.Swimmable;

public abstract class Human implements Runnable, Swimmable {

    public abstract void run();

    public abstract void swim();

}
