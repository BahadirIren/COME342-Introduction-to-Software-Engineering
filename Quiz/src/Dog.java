
public class Dog {

	private boolean isBarked;

	public Dog() {
		isBarked = false;
	}

	public void setIsBarked(boolean isDogBarked) {
		if (isDogBarked) {
			System.out.println("Dog barked.");
		}
		this.isBarked = isDogBarked;

	}

	public boolean getIsBarked() {
		return isBarked;
	}
}
