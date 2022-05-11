import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {

		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNumber) {

		// search for a guitar that matches serialNumbers
		for (Guitar guitar : guitars) {

			if (guitar.getSerialNumber() == serialNumber) {

				return guitar;

			}
		}

		// if guitar that matches serialNumbers did not found
		return null;

	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitarList = new LinkedList<Guitar>();

		for (Guitar guitar : guitars) {
			GuitarSpec guitarSpec = guitar.getSpec();

			if (guitarSpec.matches(searchSpec)) {
				matchingGuitarList.add(guitar);
			}
		}
		return matchingGuitarList;
	}

	public void removeGuitar(Guitar guitar) {
		guitars.remove(guitar);
	}

	public void removeAll() {
		guitars.clear();
	}

	public List<Guitar> getList() {
		return guitars;
	}

}
