import java.util.Scanner;

public class ElevatorHandler {

    public static void main(String[] args) {
	boolean repeat = true;
	Elevator elevator = new Elevator();
	Scanner scanner = new Scanner(System.in);
	while (repeat) {
	    System.out.println("You are currently on floor: " + elevator.getCurrentFloor());
	    System.out.println("Which floor would you like to go to?");
	    int selectFloor = scanner.nextInt();

	    if (selectFloor >= elevator.getBaseFloor() && selectFloor <= elevator.getTopFloor()) {
		if (selectFloor > elevator.getCurrentFloor()) {
		    elevator.goUp(selectFloor, elevator.getCurrentFloor());
		} else if (selectFloor < elevator.getCurrentFloor()) {
		    elevator.goDown(selectFloor, elevator.getCurrentFloor());
		} else if (selectFloor == elevator.getCurrentFloor()) {
		    System.out.println("You are already on that floor");
		}
	    } else if (selectFloor > elevator.getTopFloor()) {
		System.out.println("This building's highest floor is: " + elevator.getTopFloor());

	    } else {
		System.out.println("This building's lowest floor is: " + elevator.getBaseFloor());
	    }
	}
	scanner.close();
    }

}
