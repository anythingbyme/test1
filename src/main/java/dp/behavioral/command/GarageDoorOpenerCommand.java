package dp.behavioral.command;

public class GarageDoorOpenerCommand implements Command{
    private GarageDoorOpener garageDoorOpener;

    public GarageDoorOpenerCommand(GarageDoorOpener garageDoorOpener) {
        this.garageDoorOpener = garageDoorOpener;
    }

    @Override
    public void execute() {
        garageDoorOpener.open();
    }
}
