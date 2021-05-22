package exam2;

public class StartGame implements Command {
    private TxtHandler txtHandler;



    public StartGame(TxtHandler txtHandler) {
        this.txtHandler = txtHandler;
    }

    @Override
    public void execute() {
         Game.playGame(0,txtHandler);
    }
}