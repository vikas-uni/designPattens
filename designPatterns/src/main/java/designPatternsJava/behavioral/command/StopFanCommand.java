package designPatternsJava.behavioral.command;

/**
 * Fan stop Command where we are encapsulating both Object[fan] and the
 * operation[stop] together as command. This is the essence of the command.
 *
 */
public class StopFanCommand implements ICommand {
 
    Fan fan;
 
    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }
 
    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }
}
