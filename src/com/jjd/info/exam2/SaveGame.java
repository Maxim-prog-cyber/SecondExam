package com.jjd.info.exam2;

public class SaveGame implements Command {


    @Override
    public void execute() {
        System.out.println("Игра сохранена");
    }
}