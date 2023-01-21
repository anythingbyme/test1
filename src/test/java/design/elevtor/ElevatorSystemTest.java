package design.elevtor;

import org.junit.jupiter.api.Test;

class ElevatorSystemTest {

    private ElevatorSystem elevatorSystem = new ElevatorSystem(2);

    @Test
    void openElevator() {
        Elevator elevator = elevatorSystem.getElevator(1);
        elevator.moveTo(7);
//        elevatorSystem.findNearest(1);
        elevator = elevatorSystem.getElevator(2);
        elevator.moveTo(4);
//        elevatorSystem.findNearest(2);

        elevator = elevatorSystem.getElevator(2);
        elevator.moveTo(15);

        elevator = elevatorSystem.getElevator(10);
        elevator.moveTo(6);

    }
}