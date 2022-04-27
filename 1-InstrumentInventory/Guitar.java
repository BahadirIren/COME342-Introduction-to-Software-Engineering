import Enums.Builder;
import Enums.Type;
import Enums.Wood;

class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {

		this.serialNumber = serialNumber;
		this.price = price;
		spec = new GuitarSpec(builder, model, type, backWood, topWood);
	}

	// ----------------- Price -----------------
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	// ----------------- SerialNumber -----------------
	public String getSerialNumber() {
		return serialNumber;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}