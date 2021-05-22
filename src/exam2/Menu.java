package exam2;

import java.util.HashMap;

public class Menu {
    private final HashMap<Integer, Command> buttons;

    public Menu() {
        this.buttons = new HashMap<>();
    }

    public void setCommand(int numButton, Command command) {
        buttons.put(numButton, command);
    }

    public void buttonPress(int numButton) {
        buttons.get(numButton).execute();

    }
    public void returnMenu() {
        System.out.println("Меню:\n" +
                "1. Начать игру\n" +
                "2. Загрузить игру\n" +
                "3. Выйти");
    }
}