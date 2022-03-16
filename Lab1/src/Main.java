import java.util.List;

public class Main {

	public static void main(String[] args) {
		Guitar guitar = new Guitar();
		Guitar guitar2 = new Guitar();
		Inventory<Guitar> inventory = new Inventory<Guitar>();

		guitar.setBuilder("Yamaha");
		guitar.setPrice(500);
		inventory.add(guitar);

		guitar2.setBuilder("Honda");
		guitar2.setPrice(250);
		inventory.add(guitar2);

		List<Guitar> guitarsList = inventory.getList();

		for (Guitar item : guitarsList) {
			System.out.println("Gitar markasi: " + item.getBuilder() + "\nGitar fiyat: " + item.getPrice() + " TL\n");
		}

		// another way to print
//		for (int i = 0; i < guitarsList.size(); i++) {
//			System.out.println("Gitar markasi: " + guitarsList.get(i).getBuilder() + "\nGitar fiyat: "
//					+ guitarsList.get(i).getPrice() + " TL\n");
//		}

	}

}
