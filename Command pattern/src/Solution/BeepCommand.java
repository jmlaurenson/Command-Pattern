package Solution;

public class BeepCommand implements Command {
    Machine machine;
    int numberOfBeeps;

    public BeepCommand(Machine machine, int numberOfBeeps) {
        this.machine = machine;
        this.numberOfBeeps = numberOfBeeps;
    }

    @Override
    public void execute() {
        machine.beep(numberOfBeeps);
    }
}
