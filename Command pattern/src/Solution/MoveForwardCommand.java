package Solution;

public class MoveForwardCommand implements Command {
    Machine machine;
    private int numberOfSteps;

    public MoveForwardCommand(Machine machine, int numberOfSteps) {
        this.machine = machine;
        this.numberOfSteps = numberOfSteps;
    }

    @Override
    public void execute() {
        machine.moveForward(numberOfSteps);
    }
}
