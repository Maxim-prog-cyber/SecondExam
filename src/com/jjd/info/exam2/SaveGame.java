package com.jjd.info.exam2;

import java.io.File;

public class SaveGame implements Command {
    private TxtHandler txtHandler;

    public SaveGame(TxtHandler txtHandler) {
        this.txtHandler = txtHandler;
    }

    @Override
    public void execute() {
        txtHandler.writeToFile(Game.getResultSave());
        System.out.println("Игра сохранена");
    }
}