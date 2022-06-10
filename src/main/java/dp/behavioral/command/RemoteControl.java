package dp.behavioral.command;

import java.util.Arrays;
import java.util.List;

public class RemoteControl {
    private Command lightOnCommand = new LightOnCommand(new Light());
    private Command garageDoorOpenerCommand = new GarageDoorOpenerCommand(new GarageDoorOpener());

    private Command lightOffCommand = new LightOffCommand(new Light());
    private Command garageDoorCloseCommand = new GarageDoorOpenerCommand(new GarageDoorOpener());

    private List<Command> onCommands = Arrays.asList(lightOnCommand, garageDoorOpenerCommand);
    private List<Command> offCommands = Arrays.asList(lightOffCommand, garageDoorCloseCommand);

    public void onButtonPressed() {
        onCommands.forEach(s->s.execute());
    }

    public void offButtonPressed() {
        offCommands.forEach(s->s.execute());
    }

}
