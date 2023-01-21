package design.elevtor;

import lombok.Data;

@Data
public class Elevator {

    int id;
    int floor=1;

    public Elevator(int id) {
        this.id = id;
    }

    //User at first floor presses  up button,
    //if elevator same floor, then opens door
    //else if elevator second floor comes down to first floor

    //elevator moves from floor 2 to floor 1
    // move(int from, int to)

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void moveTo(int to) {
        if (floor == to) {
            System.out.printf("\nelevator %d is already in floor %d", id, floor);
        }
        else {
            System.out.println(String.format("\nMoving elevator %d from floor %d to floor %d", id, floor, to));
            floor = to;
        }

    }

    public void openDoor() {
        System.out.println(String.format("\nElevator is at floor %d Opening elevator door..", floor));
    }

}
