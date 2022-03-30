
public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		// not found case
//		Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder"); 

		// found case
		Guitar whatErinLikes = new Guitar("11277", 3999.95, "Collings", "CJ", "acoustic", "Indian Rosewood", "Sitka");

		Guitar guitar = inventory.search(whatErinLikes);

		if (guitar != null) {
			System.out.println("Erin, you might like this: \n\n" + guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + " guitar:\n" + guitar.getBackWood() + " back and sides, " + guitar.getTopWood()
					+ " top\n\nYou can have it for only $" + guitar.getPrice());
		} else {
			System.out.println("Sorry, Erin, we have nothing for you");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic", "Indian Rosewood", "Sitka");
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic", "Mahogany", "Adirondack");
		inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic", "Brazillian Rosewood", "Adirondack");

	}
}
