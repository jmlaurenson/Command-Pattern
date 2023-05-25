package Solution;

public class ExterminateCommand implements Command{
    Machine machine;

    public ExterminateCommand(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.exterminate();
    }
}
