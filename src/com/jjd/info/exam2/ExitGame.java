package com.jjd.info.exam2;

public class ExitGame implements Command {

    @Override
    public void execute() {
        System.out.println("Конец игры");
        System.exit(0);
    }
}