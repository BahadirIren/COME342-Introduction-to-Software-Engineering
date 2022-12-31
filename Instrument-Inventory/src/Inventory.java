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

}
