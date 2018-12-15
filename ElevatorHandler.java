import java.util.Scanner;

public class ElevatorHandler {

	public static void main(String[] args) {
		boolean selection = true;
		boolean elevatorOn = true;
		Elevator elevator = new Elevator((int) (Math.random() * 20 + 0), "Emil Elevators Inc #1337");
		Scanner scanner = new Scanner(System.in);

		while (selection) {
			System.out.println("Please choose one of the following:");
			System.out.println("1 to move elevator");
			System.out.println("2 to exit elevator");
			System.out.println("3 to view elevator information");

			int userSelection = scanner.nextInt();
			switch (userSelection) {
			case 1:
				while (elevatorOn) {
					System.out.println("You are currently on floor: " + elevator.getCurrentFloor());
					System.out.println("Which floor would you like to go to?");
					int selectFloor = scanner.nextInt();
					elevator.MoveElevator(selectFloor);
					break;
				}
				break;

			case 2:
				System.out.println("Pling... Thank you for using " + elevator.getElevatorName());
				System.exit(0);
				break;

			case 3:
				elevator.elevatorInfo();
				break;

			default:
				System.out.println("Invalid selection, try again");
			}

		}
		scanner.close();
	}
}
