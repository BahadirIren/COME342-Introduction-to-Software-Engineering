import java.util.List;

import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		// not found case
//		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ADIRONDACK,
//				Wood.ADIRONDACK);

		// found case
//		GuitarSpec whatErinLikes = new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
//				Wood.SITKA);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER);

		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

		if (matchingGuitars.isEmpty()) {
			System.out.println("Sorry, Erin, we have nothing for you");
			return;
		}

		System.out.println("Erin, you might like this: \n");
		for (Guitar guitar : matchingGuitars) {
			GuitarSpec spec = guitar.getSpec();

			System.out.println(" - " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n"
					+ spec.getBackWood() + " back and sides, " + spec.getTopWood()
					+ " top\n\nYou can have it for only $" + guitar.getPrice() + "\n");

		}

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA);
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("122784", 5495.95, Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK);
		inventory.addGuitar("76531", 6295.95, Builder.MARTIN, "OM-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.ADIRONDACK);

	}
}
