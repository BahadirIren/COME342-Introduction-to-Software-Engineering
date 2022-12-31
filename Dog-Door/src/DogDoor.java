import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door opens");
		open = true;
	}

	public void close() {
		System.out.println("The dog door closes");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		final Timer timer = new Timer();

		// amount of time that dog spends in outside (in milliseconds)
		long dogOutsideDuration = 4000;

		System.out.println("Karabas barks to go outside");
		remote.pressButton();

		System.out.println("Karabas has gone outside");

		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Karabas's all done");

				if (door.isOpen())
					System.out.println("Karabas got back inside");
				else {
					System.out.println("Karabas barks to got back inside");
					remote.pressButton();
					System.out.println("Karabas got back inside");
				}
			}
		};

		// it is alternative for wait procedure
//		try {
//			Thread.sleep(dogOutsideDuration);
//		} catch (InterruptedException e) {
//
//		}

		timer.schedule(task, dogOutsideDuration);

	}

}
