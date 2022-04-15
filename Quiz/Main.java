public class Main {

	public static void main(String[] args) {

		DogDoor door = new DogDoor();
		Dog dog = new Dog();

		// we open door for case, dog goes back inside while the door open
//		door.openDoor();

		// if door is close then dog barks
		if (!door.getIsOpened()) {
			dog.setIsBarked(true);
		} else {
			System.out.println("Door is already open, dog is inside.");
			door.pressButton();
		}

		if (dog.getIsBarked()) {
			door.pressButton();
			dog.setIsBarked(false);
			System.out.println("Dog is inside.");
			door.closeDoorAutomatically();

		}

	}

}
