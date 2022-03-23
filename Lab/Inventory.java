import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> list;

	public Inventory() {
		list = new LinkedList<Guitar>();
	}

	public void addGuitar(Guitar item) {
		list.add(item);
	}

	public Guitar getGuitar(String serialNumber) {

		// search for a guitar that matches serialNumbers
		for (Guitar guitar : list) {

			if (guitar.getSerialNumber() == serialNumber) {

				return guitar;

			}
		}

		// if guitar that matches serialNumbers did not found
		return null;

	}

	public Guitar searchGuitar(Guitar searchGuitar) {

		for (Guitar guitar : list) {

			String builder = searchGuitar.getBuilder();
			if ((builder != null) && (builder.equals("")) && (!builder.equals(guitar.getBuilder()))) {
				continue;
			}

			String model = searchGuitar.getModel();
			if ((model != null) && (model.equals("")) && (!model.equals(guitar.getModel()))) {
				continue;
			}

			String type = searchGuitar.getType();
			if ((type != null) && (type.equals("")) && (!type.equals(guitar.getType()))) {
				continue;
			}

			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (backWood.equals("")) && (!backWood.equals(guitar.getBackWood()))) {
				continue;
			}

			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))) {
				continue;
			}

			// TODO add necessary commands
			return searchGuitar;

		}
		return null;
	}

	public void removeGuitar(Guitar guitar) {
		list.remove(guitar);
	}

	public void removeAll() {
		list.clear();
	}

	public List<Guitar> getList() {
		return list;
	}

}
