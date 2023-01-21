package design.elevtor;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

    List<Elevator> elevators;

    public ElevatorSystem(int elevatorCount) {
        System.out.println("Initializing elevators");
        this.elevators = new ArrayList<>(elevatorCount);

        // init elevator
        addElevator(1);
        addElevator(2);
        System.out.println("Added 2 elevators");

        //reset each elevator to first floor
        reset(1);
        System.out.println("\nReset elevators to floor 1 complete");
    }

    private void reset(int floor) {
        for (Elevator elevator: elevators) {
            elevator.moveTo(floor);
        }
    }

    public Elevator getElevator(int toFloor) {
        // check if any elevator is at same floor ie floorAt
        System.out.println("\nElevator button pressed at floor " + toFloor);
//        Elevator elevator = elevators.stream().filter(e->e.getFloor() == floorAt).findFirst().get();
        Elevator elevator = findNearest(toFloor);
        elevator.moveTo(toFloor);
        elevator.openDoor();
        return elevator;
    }

    public void moveTo(int floor) {
        //check if ay elevator is this floor
        // else find the ne
        System.out.println("\n Moving to floor " + floor);

        // find the nearest elevator
        moveTo(floor);
    }

    // to = 1;
    // elev1 = 4
    // elev2 = 2

    // elev1 = 3;
    // elev1 = 3


    // toFloor = 6
    // elev1 = 3
    // elev2 = 15


    public Elevator findNearest(int toFloor) {
        Elevator nearest = null;
        int distance = Integer.MAX_VALUE;
        for (Elevator elevator:elevators) {
            if (elevator.getFloor() == toFloor) {
                System.out.println("\n(Exact match found) Nearest elevator is at floor " + elevator.getFloor());
                return elevator;
            }
            else {

                if (Math.abs(elevator.getFloor() - toFloor) <= distance ) {
                    distance = Math.abs(elevator.getFloor() - toFloor);
                    nearest = elevator;
                }
            }
        }
        System.out.println("\n(before return Looped thru and found nearest match) Nearest elevator is at floor" + nearest.getFloor());
        return nearest;

    }

    private void addElevator(int id) {
        elevators.add(new Elevator(id));
    }

}
