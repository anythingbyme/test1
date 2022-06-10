package dp.behavioral.command;

/**
 * encapsulate method invocation i.e do not need to figure out how things get done
 * command pattern decouples requestor of action from actual object that oerforms action
 * Command object encapsulates a request to do something on an object
 * Command encapsulates actual object that perofrms action
 * Client creates command
 * Invoker sets the command
 * Receiver performs action
 *
 */
public interface Command {
    void execute();
}
