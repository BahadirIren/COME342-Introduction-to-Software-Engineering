import java.util.LinkedList;
import java.util.List;

import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {

		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
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

			if (searchSpec.getBuilder() != guitarSpec.getBuilder()) {
				continue;
			}

			String model = searchSpec.getModel().toLowerCase();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase()))) {
				continue;
			}

			if (searchSpec.getType() != guitarSpec.getType()) {
				continue;
			}

			if (searchSpec.getBackWood() != guitarSpec.getBackWood()) {
				continue;
			}

			if (searchSpec.getTopWood() != guitarSpec.getTopWood()) {
				continue;
			}

			matchingGuitarList.add(guitar);
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
