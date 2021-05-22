package exam2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        File file = new File("t.txt");
        TxtHandler txtHandler = new TxtHandler(file);


        menu.setCommand(1, new StartGame(txtHandler));
        menu.setCommand(2, new LoadGame(txtHandler));
        menu.setCommand(3, new ExitGame());
        menu.setCommand(4, new SaveGame());

        Scanner scanner = new Scanner(System.in);
        menu.returnMenu();
        while (true) {
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    menu.buttonPress(1);
                    menu.returnMenu();
                    break;
                case 2:
                    menu.buttonPress(2);
                    menu.returnMenu();
                    break;
                case 3:
                    menu.buttonPress(3);
                    menu.returnMenu();
                    break;
                default:
                    System.out.println("Ошибка ввода данных");
            }
        }
    }
}