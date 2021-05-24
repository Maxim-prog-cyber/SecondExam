package com.jjd.info.exam2;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private final HashMap<Integer, Command> buttons;
    private File file;
    private TxtHandler txtHandler;
    private Scanner scanner;

    public Menu() {
        this.file = new File("t.txt");
        this.txtHandler = new TxtHandler(file);
        this.buttons = new HashMap<>();
        buttons.put(1, new StartGame());
        buttons.put(2, new LoadGame(txtHandler));
        buttons.put(3, new ExitGame());
        buttons.put(4, new SaveGame(txtHandler));
    }


    public void buttonPress(int numButton) {
        buttons.get(numButton).execute();

    }

    public void run() {
        scanner = new Scanner(System.in);
        returnMenu();
        while (true) {
            int n = scanner.nextInt();

            if (n > 0 && n < 4) {
                buttonPress(n);
               if (Game.isSave()){
                   buttonPress(4);
               }
                returnMenu();
            } else System.out.println("Ошибка ввода данных");
        }

    }


    private void returnMenu() {
        System.out.println("Меню:\n" +
                "1. Начать игру\n" +
                "2. Загрузить игру\n" +
                "3. Выйти");
    }
}