import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Enums.Builder;
import Enums.InstrumentType;
import Enums.Style;
import Enums.Type;
import Enums.Wood;

public class FindInstrumentTester {

	static String userName;

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		getUserNameFromUser();

		Map<String, Object> properties = new HashMap<>();
		properties.put("builder", Builder.MARTIN);
		properties.put("backWood", Wood.ADIRONDACK);

		InstrumentSpec whatUserLikes = new InstrumentSpec(properties);

		List<Instrument> matchingInstruments = inventory.search(whatUserLikes);

		printInstruments(matchingInstruments);

	}

	private static void initializeInventory(Inventory inventory) {

		Map<String, Object> properties = new HashMap<>();

		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numString", 6);
		properties.put("topWood", Wood.INDIAN_ROSEWOOD);
		properties.put("backWood", Wood.SITKA);
		inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

		properties.put("builder", Builder.MARTIN);
		properties.put("model", "D-18");
		properties.put("topWood", Wood.MAHOGANY);
		properties.put("backWood", Wood.ADIRONDACK);
		inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

		properties.put("builder", Builder.FENDER);
		properties.put("model", "Stratocastor");
		properties.put("type", Type.ELECTRIC);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood", Wood.ALDER);
		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.MANDOLIN);
		properties.put("type", Type.ACOUSTIC);
		properties.put("model", "F-5G");
		properties.put("backWood", Wood.MAPLE);
		properties.put("topWood", Wood.MAPLE);
		properties.remove("numString");
		properties.put("style", Style.A);
		inventory.addInstrument("9019920", 1549.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.BANJO);
		properties.put("model", "RB-3 Wreath");
		properties.remove("topWood");
		properties.put("numString", 5);
		inventory.addInstrument("8900231", 2435.95, new InstrumentSpec(properties));

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

			if (matchingInstruments.size() != 1) // if we have more than 1 instruments
				System.out.println(userName + ", you might like these instruments\n");
			else
				System.out.println(userName + ", you might like this instrument\n");

			for (Instrument instrument : matchingInstruments) {

				InstrumentSpec spec = instrument.getSpec();

				System.out
						.println("We have a " + spec.getProperty("instrumentType") + " with the following properties:");

				for (Map.Entry<String, Object> entry : spec.getProperties().entrySet()) {

					if (entry.getKey().equals("instrumentType"))
						continue;

					System.out.println(" " + entry.getKey() + ": " + entry.getValue());
				}

				System.out.println("You can have this " + spec.getProperty("instrumentType") + " for $"
						+ instrument.getPrice() + "\n---");

			}

		} else
			System.out.println("Sorry, " + userName + ", we have nothing for you");

	}
}
