package Solution;

public class Machine implements MachineInterface {

    private int position;

    public void moveForward(int steps) {
        this.position += steps;
        System.out.println("* Moved "+steps+" steps *");
    }

    public void beep(int numberOfBeeps) {
        for(int i = 0; i<numberOfBeeps; i++) {
            System.out.println("beep");
        }
    }

    public void exterminate() {
        System.out.println("EXTERMINATE!!");
    }

}
