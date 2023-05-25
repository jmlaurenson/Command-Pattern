package Solution;

public class Main {

    public static void main(String[] args)
    {
        Machine machine = new Machine();
        MachineInvoker machineInvoker = new MachineInvoker();

        // Create commands
        BeepCommand beepCommand = new BeepCommand(machine, 4);
        MoveForwardCommand moveForwardCommand = new MoveForwardCommand(machine, 8);
        ExterminateCommand exterminateCommand = new ExterminateCommand(machine);

        // Add commands to list
        machineInvoker.addCommand(beepCommand);
        machineInvoker.addCommand(moveForwardCommand);
        machineInvoker.addCommand(exterminateCommand);

        machineInvoker.execute();
    }

}
