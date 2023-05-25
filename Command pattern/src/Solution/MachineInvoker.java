package Solution;

import java.util.ArrayList;
import java.util.List;

public class MachineInvoker {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void execute() {
        for (Command c : commandList) {
            c.execute();
        }
        commandList.clear();
    }
}
