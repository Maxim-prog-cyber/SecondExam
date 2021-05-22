package exam2;

public class LoadGame implements Command {

    private final TxtHandler txtHandler;


    public LoadGame(TxtHandler txtHandler) {
        this.txtHandler = txtHandler;
    }

    @Override
    public void execute() {
        String string = txtHandler.readFromFile();
        int n = Integer.parseInt(string);
        Game.playGame(n,txtHandler);




    }

}