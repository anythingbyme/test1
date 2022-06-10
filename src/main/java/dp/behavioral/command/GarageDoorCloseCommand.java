package dp.behavioral.command;

public class GarageDoorCloseCommand implements Command{
    private GarageDoorOpener garageDoorOpener;

    public GarageDoorCloseCommand(GarageDoorOpener garageDoorOpener) {
        this.garageDoorOpener = garageDoorOpener;
    }

    @Override
    public void execute() {
        garageDoorOpener.close();
    }
}
