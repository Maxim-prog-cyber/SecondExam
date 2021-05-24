package com.jjd.info.exam2;

public class StartGame implements Command {

    @Override
    public void execute() {
         Game.playGame(0);
    }
}