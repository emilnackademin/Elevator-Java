
public class Elevator {

	private int currentFloor;
	private String elevatorName;
	final int BASEFLOOR = 0, TOPFLOOR = 20;

	public Elevator(int startFloor, String name) {
		setCurrentFloor(startFloor);
		setElevatorName(name);
	}

	public String getElevatorName() {
		return elevatorName;
	}

	private void setElevatorName(String elevatorName) {
		this.elevatorName = elevatorName;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	private void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	int goUp(int amountFloors) {
		int newFloor = getCurrentFloor() + amountFloors;
		if (newFloor <= TOPFLOOR) {
			for (int i = (getCurrentFloor() + 1); i <= newFloor; i++) {
				System.out.println("Pling... At floor: " + i);
			}
			setCurrentFloor(newFloor);
		} else {
			System.out.println("This elevator's highest floor is: " + TOPFLOOR);
		}
		return newFloor;
	}

	int goDown(int amountFloors) {
		int newFloor = getCurrentFloor() - amountFloors;
		if (newFloor >= BASEFLOOR) {
			for (int i = (getCurrentFloor() - 1); i >= newFloor; i--) {
				System.out.println("Pling... At floor: " + i);
			}
			setCurrentFloor(newFloor);
		} else {
			System.out.println("This building's lowest floor is: " + BASEFLOOR);
		}
		return newFloor;
	}

	public void MoveElevator(int selectFloor) {
		if (selectFloor > getCurrentFloor()) {
			goUp(selectFloor - getCurrentFloor());
		} else if (selectFloor < getCurrentFloor()) {
			goDown(getCurrentFloor() - selectFloor);
		} else {
			System.out.println("You are already on that floor");
		}
	}

	public void elevatorInfo() {
		System.out.println("Elevator name: " + elevatorName);
		System.out.println("Current Floor:" + getCurrentFloor());
		System.out.println("Base Floor: " + BASEFLOOR);
		System.out.println("Top Floor: " + TOPFLOOR);
		System.out.println("Total Floors: " + (TOPFLOOR + 1));
	}

}
