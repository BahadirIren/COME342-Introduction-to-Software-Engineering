
public class DogDoor {

	private boolean isOpened;

	public DogDoor() {
		isOpened = false;

	}

	public void openDoor() {
		isOpened = true;
	}

	public void closeDoor() {
		isOpened = false;
	}

	public void pressButton() {
		if (!isOpened) {
			System.out.println("Door is opening...");
			openDoor();
			System.out.println("Door opened.");
		} else {
			System.out.println("Door is closing...");
			closeDoor();
			System.out.println("Door closed.");
		}
	}

	public boolean getIsOpened() {
		return isOpened;
	}

	public void closeDoorAutomatically() {

		closeDoor();
		System.out.println("Door automatically closed.");

	}

}
