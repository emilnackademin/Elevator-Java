
public class Elevator {

    private int currentFloor, baseFloor, topFloor;
    final int FLOORS = 21;

    public Elevator() {
	super();
	this.setCurrentFloor((int) (Math.random() * 20 + 1));
	this.setBaseFloor(0);
	this.setTopFloor(20);

    }

    public int getCurrentFloor() {
	return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
	this.currentFloor = currentFloor;
    }

    public int getBaseFloor() {
	return baseFloor;
    }

    public void setBaseFloor(int baseFloor) {
	this.baseFloor = baseFloor;
    }

    public int getTopFloor() {
	return topFloor;
    }

    public void setTopFloor(int topFloor) {
	this.topFloor = topFloor;
    }

    int goUp(int selectFloor, int currentFloor) {
	this.currentFloor = selectFloor;
	if (selectFloor <= 20) {
	    for (int i = currentFloor; i <= selectFloor; i++) {
		System.out.println("Pling... At floor: " + i);
	    }
	}
	return selectFloor;
    }

    int goDown(int selectFloor, int currentFloor) {
	this.currentFloor = selectFloor;
	for (int i = currentFloor; i >= selectFloor; i--)
	    System.out.println("Pling... At floor: " + i);
	return selectFloor;
    }

}
