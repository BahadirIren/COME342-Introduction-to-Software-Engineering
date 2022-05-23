import java.util.List;
import java.util.Scanner;

import Enums.Builder;
import Enums.Style;
import Enums.Type;
import Enums.Wood;

public class FindGuitarTester {

	static String userName;

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		getUserNameFromUser();

		List<Instrument> matchingInstruments = null;

		boolean testGuitar = true;
		if (testGuitar) {
			// if user likes guitar
			GuitarSpec whatUserLikes = new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD,
					Wood.ALDER);
			matchingInstruments = inventory.search(whatUserLikes);

		} else {
			// if user likes mandolin
			MandolinSpec whatUserLikes = new MandolinSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, Style.A,
					Wood.INDIAN_ROSEWOOD, Wood.ALDER);
			matchingInstruments = inventory.search(whatUserLikes);
		}

		printInstruments(matchingInstruments);

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addInstrument("11277", 3999.95,
				new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.ALDER));
		inventory.addInstrument("11333", 7000.95,
				new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.ALDER));
		inventory.addInstrument("V95693", 1499.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 7, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("V9512", 1549.95,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 7, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("2123432", 5210,
				new MandolinSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, Style.A, Wood.INDIAN_ROSEWOOD, Wood.ALDER));

	}

	private static void getUserNameFromUser() {
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Hello, Enter your name: ");
			userName = input.next();
			System.out.println();

		} while (!Character.isLetter(userName.charAt(0)));

		input.close();
	}

	private static void printInstruments(List<Instrument> matchingInstruments) {

		if (!matchingInstruments.isEmpty()) {

			String instrumentType = matchingInstruments.get(0).toString();

			if (matchingInstruments.size() != 1) // if we have more than 1 instruments
				System.out.println(userName + ", you might like these " + instrumentType + "s\n");
			else
				System.out.println(userName + ", you might like this " + instrumentType + "\n");

			for (Instrument instrument : matchingInstruments) {

				InstrumentSpec spec = null;
				if (instrument instanceof Guitar)
					spec = (GuitarSpec) instrument.getSpec();
				if (instrument instanceof Mandolin)
					spec = (MandolinSpec) instrument.getSpec();
				// if we will have more instruments than check the instrument if it is
				// instanceof new Instrument

				System.out.println("- We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " " + instrumentType + ":\n " + spec.getBackWood() + " back and sides, \n "
						+ spec.getTopWood() + " top\n You can have it for only $" + instrument.getPrice() + "\n");
			}

		} else
			System.out.println("Sorry, " + userName + ", we have nothing for you");

	}
}
