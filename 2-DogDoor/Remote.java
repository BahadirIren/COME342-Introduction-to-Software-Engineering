import java.util.Timer;
import java.util.TimerTask;

public class Remote {

	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the remote control button...");

		if (door.isOpen())
			door.close();
		else {
			door.open();

			// for automatically closing the door after 3 seconds
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				public void run() {
					if (door.isOpen())
						door.close();
					timer.cancel();
				}
			}, 3000);
		}

	}

}
