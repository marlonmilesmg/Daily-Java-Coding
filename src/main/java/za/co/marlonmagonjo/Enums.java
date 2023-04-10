package za.co.marlonmagonjo;

/**
 *  Enums types -
 *  A special data type that enables for a variable to be a set of predefined constants.
 *  e.g.
 *  enum Day {
 *      SUNDAY, MONDAY, ...
 *  }
 *
 *
 */

enum State {
    STOPPED,
    STARTING,
    STARTED
}

class Machine {
    private State state = State.STOPPED;

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
public class Enums {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.setState(State.STARTING);
        System.out.println(machine.getState());
        System.out.println("======================================");
        machine.setState(State.STARTED);
        System.out.println(machine.getState());
        System.out.println("======================================");
        machine.setState(State.STOPPED);
        System.out.println(machine.getState());
        System.out.println("=======================================");
    }
}
